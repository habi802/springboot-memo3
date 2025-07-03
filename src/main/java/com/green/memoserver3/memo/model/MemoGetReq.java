package com.green.memoserver3.memo.model;

import lombok.Getter;
import lombok.ToString;

import java.beans.ConstructorProperties;

@Getter
@ToString
public class MemoGetReq {
    String searchText;

    @ConstructorProperties({"search_text"})
    public MemoGetReq(String searchText) {
        this.searchText = searchText;
    }
}
