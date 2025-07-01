package com.green.memoserver3.memo;

import com.green.memoserver3.memo.model.MemoPostReq;
import com.green.memoserver3.memo.model.MemoPutReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemoService {
    private final MemoMapper memoMapper;

    public int post(MemoPostReq req) {
        return memoMapper.post(req);
    }

    public int put(MemoPutReq req) {
        return memoMapper.put(req);
    }

    public int delete(int memoId) {
        return memoMapper.delete(memoId);
    }
}
