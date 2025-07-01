package com.green.memoserver3.memo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class MemoGetRes {
    @JsonProperty("memoId")
    private int id;
    private String title;
    private String createdAt;
}
