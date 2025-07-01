package com.green.memoserver3.memo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class MemoPutReq {
    private int memoId;
    private String title;
    private String content;
}
