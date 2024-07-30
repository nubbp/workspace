package com.green.Board.controller;

import com.green.Board.service.BoardService;
import com.green.Board.vo.BoardVO;
import com.green.Board.vo.SearchVO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/board")
public class BoardController {

    @Resource(name = "boardService")
    private BoardService boardService;

//    게시글 목록
    @PostMapping("/list")
    public List<BoardVO> getBoardList(@RequestBody SearchVO searchVO) {
        log.info(searchVO.toString());
        return boardService.getBoardList(searchVO);
    }

    @GetMapping("/detail/{boardNum}")
    public BoardVO getBoardDetail(@PathVariable(name = "boardNum") int boardNum) {
        return boardService.getBoardDetail(boardNum);
    }

    @PostMapping("/regBoard")
    public void regBoard(@RequestBody BoardVO boardVO) {
        log.info("============");
        log.info("====== boardController.insertBoard() 실행 ======");
        boardService.regBoard(boardVO);
    }

    @DeleteMapping("/deleteBoard/{boardNum}")
    public void deleteBoard(@PathVariable(name = "boardNum") int boardNum) {
        boardService.deleteBoard(boardNum);
    }

    @PutMapping("/updateBoard")
    public void updateBoard(@RequestBody BoardVO boardVO) {
        boardService.updateBoard(boardVO);
    }

}
