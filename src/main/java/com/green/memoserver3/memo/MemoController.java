package com.green.memoserver3.memo;

import com.green.memoserver3.config.model.ResultResponse;
import com.green.memoserver3.memo.model.MemoGetRes;
import com.green.memoserver3.memo.model.MemoPostReq;
import com.green.memoserver3.memo.model.MemoPutReq;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/memo")
public class MemoController {
    private final MemoService memoService;

    @PostMapping
    public ResultResponse<Integer> post(@RequestBody MemoPostReq req, HttpServletRequest request) {
        req.setCreatedIp(getUserIp(request));
        log.info("post req={}", req);
        int result = memoService.post(req);
        return new ResultResponse<>("등록 성공", result);
    }

    public static String getUserIp(HttpServletRequest request) {
        String ip = request.getRemoteAddr();

        if ("0:0:0:0:0:0:0:1".equals(ip) || "::1".equals(ip)) {
            ip = "127.0.0.1";
        }

        return ip;
    }

    @GetMapping
    public ResultResponse<List<MemoGetRes>> get() {
        List<MemoGetRes> result = memoService.get();
        String message = String.format("rows: %d", result.size());
        return new ResultResponse<>(message, result);
    }

    @PutMapping
    public ResultResponse<Integer> put(@RequestBody MemoPutReq req) {
        log.info("put req={}", req);
        int result = memoService.put(req);
        return new ResultResponse<>("수정 성공", result);
    }

    @DeleteMapping
    public ResultResponse<Integer> delete(@RequestParam(name = "memo_id") int memoId) {
        log.info("delete memoId={}", memoId);
        int result = memoService.delete(memoId);
        return new ResultResponse<>("삭제 성공", result);
    }
}
