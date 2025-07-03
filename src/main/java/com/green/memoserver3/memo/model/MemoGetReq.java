package com.green.memoserver3.memo.model;

import lombok.Getter;
import lombok.ToString;

import java.beans.ConstructorProperties;

@Getter
@ToString
public class MemoGetReq {
    String searchOption;
    String searchText;

    @ConstructorProperties({"search_option", "search_text"})
    public MemoGetReq(String searchOption, String searchText) {
        this.searchOption = searchOption;
        this.searchText = searchText;
    }
}
