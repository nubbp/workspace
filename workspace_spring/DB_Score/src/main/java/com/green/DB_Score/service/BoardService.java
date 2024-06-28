package com.green.DB_Score.service;

import com.green.DB_Score.vo.BoardVO;

import java.util.List;

public interface BoardService {
    List<BoardVO> readBoard();
    void writeBoard(BoardVO boardVO);
}
