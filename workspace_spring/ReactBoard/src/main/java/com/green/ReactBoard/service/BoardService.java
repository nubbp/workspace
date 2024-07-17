package com.green.ReactBoard.service;

import com.green.ReactBoard.vo.BoardVO;

import java.util.List;

public interface BoardService {

//    게시글 목록 조회
    List<BoardVO> getBoardList();
    BoardVO getBoard(int boardNum);
    void regBoard(BoardVO boardVO);
    void deleteBoard(int boardNum);
}
