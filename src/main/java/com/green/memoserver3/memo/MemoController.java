package com.green.memoserver3.memo;

import com.green.memoserver3.config.model.ResultResponse;
import com.green.memoserver3.memo.model.MemoPostReq;
import com.green.memoserver3.memo.model.MemoPutReq;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/memo")
public class MemoController {
    private final MemoService memoService;

    @PostMapping
    public ResultResponse<Integer> post(@RequestBody MemoPostReq req, HttpServletRequest request) {
        req.setIp(getUserIp(request));
        log.info("req={}", req);
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

    @PutMapping
    public ResultResponse<Integer> put(@RequestBody MemoPutReq req) {
        log.info("req={}", req);
        int result = memoService.put(req);
        return new ResultResponse<>("수정 성공", result);
    }
}
