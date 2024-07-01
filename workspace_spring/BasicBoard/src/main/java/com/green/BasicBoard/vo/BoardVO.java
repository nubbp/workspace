package com.green.BasicBoard.vo;

import lombok.Data;

@Data
public class BoardVO {
    private int boardNum;
    private String boardTitle;
    private String writer;
    private String content;
    private String createDate;
    private String readCnt;
}