package com.green.BasicBoard.controller;

import com.green.BasicBoard.service.BoardImpl;
import com.green.BasicBoard.vo.BoardVO;
import com.green.BasicBoard.vo.SearchVO;
import jakarta.annotation.Resource;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReactController {

    @Resource(name = "BoardService")
    private BoardImpl board;

//    board_list 불러오기
   @RequestMapping("/list")
    public List<BoardVO> boradList(Model model, SearchVO searchVO) {
       //  목록 조회
        List<BoardVO> boardList = board.readBoard(searchVO);
        return boardList;
    }

}
