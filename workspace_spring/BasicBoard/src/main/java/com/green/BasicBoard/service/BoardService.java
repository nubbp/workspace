package com.green.BasicBoard.service;

import com.green.BasicBoard.vo.BoardVO;
import com.green.BasicBoard.vo.SearchVO;

import java.util.List;

public interface BoardService {
    List<BoardVO> readBoard(SearchVO searchVO);
    void writeBoard(BoardVO boardVO);
    BoardVO readOneBoard(int num);
    void updateBoard(BoardVO boardVO);
}
