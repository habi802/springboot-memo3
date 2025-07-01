package com.green.memoserver3.memo;

import com.green.memoserver3.config.model.ResultResponse;
import com.green.memoserver3.memo.model.MemoPostReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/memo")
public class MemoController {
    private final MemoService memoService;

    @PostMapping
    public ResultResponse<Integer> post(@RequestBody MemoPostReq req) {
        log.info("req={}", req);
        int result = memoService.post(req);
        return new ResultResponse<>("등록 성공", result);
    }
}
