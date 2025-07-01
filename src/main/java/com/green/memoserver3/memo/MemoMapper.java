package com.green.memoserver3.memo;

import com.green.memoserver3.memo.model.MemoPostReq;
import com.green.memoserver3.memo.model.MemoPutReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemoMapper {
    int post(MemoPostReq req);
    int put(MemoPutReq req);
    int delete(int memoId);
}
