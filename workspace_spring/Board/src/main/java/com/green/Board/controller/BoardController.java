package com.green.Board.controller;

import com.green.Board.service.BoardService;
import com.green.Board.vo.BoardVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardController {

    @Resource(name = "boardService")
    private BoardService boardService;

//    게시글 목록
    @GetMapping("/list")
    public List<BoardVO> getBoardList() {
        return boardService.getBoardList();
    }

    @GetMapping("/detail/{boardNum}")
    public BoardVO getBoardDetail(@PathVariable(name = "boardNum") int boardNum) {
        return boardService.getBoardDetail(boardNum);
    }

    @PostMapping("/regBoard")
    public void regBoard(@RequestBody BoardVO boardVO) {
        boardService.regBoard(boardVO);
    }

}
