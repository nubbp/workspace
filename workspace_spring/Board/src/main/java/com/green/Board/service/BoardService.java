package com.green.Board.service;

import com.green.Board.vo.BoardVO;

import java.util.List;

public interface BoardService {
    List<BoardVO> getBoardList();
    BoardVO getBoardDetail(int boardNum);
    void regBoard(BoardVO boardVO);
}
