package com.green.Board.vo;

import lombok.Data;

// 페이징 처리를 위한 모든 정보를 갖는 클래스
@Data
public class PageVO {
//    전체 데이터 수
    private int totalDataCnt;

//    전체 페에지 수
    private int totalPageCnt;

//    한 페이지에 보여지는 데이터 수
    private int displayDataCnt;

//    현재 페이지
    private int nowPage;

//    한 화면에 보여지는 페이지 수
    private int displayPageCnt;

//    화면에 보이는 시작 페이지
    private int beginPage;

//    화면에 보이는 마지막 페이지
    private int endPage;

//    이전 버튼 유무
    private boolean prev;

//    다음 버튼 유무
    private boolean next;

//    SQL용 offset 변수
    private int offset;

//    생성자
    public PageVO(int totalDataCnt) {
        nowPage = 1;
        displayPageCnt = 5;
        displayDataCnt = 10;
        this.totalDataCnt = totalDataCnt;
    }

//    모든 페이지 정보를 세팅하는 메소드
    public void setPageInfo() {
//        총 게시글 수 -> totalDataCnt
//        현재 페이지 -> nowPage
//        한 화면에 보이는 페이지 수-> displayPageCnt
        endPage = (int)Math.ceil(nowPage / (double)displayPageCnt) * displayPageCnt;

//      화면에 보이는 시작 페이지 번호
        beginPage = endPage - displayPageCnt + 1;

//      전체 페이지 수
        totalPageCnt = (int)Math.ceil(totalDataCnt / (double)displayDataCnt);

        if (endPage > totalPageCnt) { endPage = totalPageCnt; }

//      이전 버튼 유무
        prev = beginPage != 1;

//      다음 버튼 유무
        next = endPage != totalPageCnt;

//      SQL용 offset 변수
        offset = displayDataCnt * (nowPage - 1);
    }
}
