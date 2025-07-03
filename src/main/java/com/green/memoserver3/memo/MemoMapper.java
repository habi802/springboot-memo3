package com.green.memoserver3.memo;

import com.green.memoserver3.memo.model.MemoGetRes;
import com.green.memoserver3.memo.model.MemoPostReq;
import com.green.memoserver3.memo.model.MemoPutReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemoMapper {
    int post(MemoPostReq req);
    List<MemoGetRes> get(String searchText);
    MemoGetRes getById(int memoId);
    int put(MemoPutReq req);
    int delete(int memoId);
}
