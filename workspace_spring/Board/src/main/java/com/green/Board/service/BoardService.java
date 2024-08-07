package com.green.Board.service;

import com.green.Board.vo.BoardVO;
import com.green.Board.vo.PageVO;
import com.green.Board.vo.SearchVO;

import java.util.List;

public interface BoardService {
    List<BoardVO> getBoardList(PageVO pageVO);
    BoardVO getBoardDetail(int boardNum);
    void regBoard(BoardVO boardVO);
    void deleteBoard(int boardNum);
    void updateBoard(BoardVO boardVO);
//    List<BoardVO> getSearchList(SearchVO searchVO);
    int getBoardCnt();
}
