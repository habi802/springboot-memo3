package com.green.memoserver3.memo;

import com.green.memoserver3.memo.model.MemoPostReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemoService {
    private final MemoMapper memoMapper;

    public int post(MemoPostReq req) {
        return memoMapper.post(req);
    }
}
