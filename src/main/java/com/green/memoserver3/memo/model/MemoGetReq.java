package com.green.memoserver3.memo.model;

import lombok.Getter;
import lombok.ToString;

import java.beans.ConstructorProperties;

@Getter
@ToString
public class MemoGetReq {
    String searchOption;
    String searchText;
    Integer lastIdx;
    Integer limit;

    @ConstructorProperties({"search_option", "search_text", "last_idx", "limit"})
    public MemoGetReq(String searchOption, String searchText, Integer lastIdx, Integer limit) {
        this.searchOption = searchOption;
        this.searchText = searchText;
        this.lastIdx = lastIdx;
        this.limit = limit;
    }
}
