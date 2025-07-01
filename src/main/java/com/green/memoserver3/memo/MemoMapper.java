package com.green.memoserver3.memo;

import com.green.memoserver3.memo.model.MemoPostReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemoMapper {
    int post(MemoPostReq req);
}
