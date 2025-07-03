package com.green.memoserver3.memo;

import com.green.memoserver3.memo.model.MemoGetReq;
import com.green.memoserver3.memo.model.MemoGetRes;
import com.green.memoserver3.memo.model.MemoPostReq;
import com.green.memoserver3.memo.model.MemoPutReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemoService {
    private final MemoMapper memoMapper;

    public int post(MemoPostReq req) {
        return memoMapper.post(req);
    }

    public List<MemoGetRes> get(MemoGetReq req) {
        return memoMapper.get(req);
    }

    public MemoGetRes getById(int memoId) {
        return memoMapper.getById(memoId);
    }

    public int put(MemoPutReq req) {
        return memoMapper.put(req);
    }

    public int delete(int memoId) {
        return memoMapper.delete(memoId);
    }
}
