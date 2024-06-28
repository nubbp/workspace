package com.green.DB_Score.controller;

import com.green.DB_Score.service.BoardImpl;
import com.green.DB_Score.vo.BoardVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BoradController {

    @Resource(name = "BoardService")
    private BoardImpl board;


//    게시글 목록 화면 불러오기
    @GetMapping("/list")
    public String getList(Model model) {
        List<BoardVO> boardList = board.readBoard();
        model.addAttribute("boardList", boardList);
        return "board_list";
    }

//    글 작성 화면 불러오기
    @GetMapping("/writeForm")
    public String writeForm() {
        return "board_write_form";
    }

//    글 등록 후 상세 조회 화면 이동
    @PostMapping("/writeBoard")
    public String writeBoard(BoardVO boardVO) {
        board.writeBoard(boardVO);
        return "board_detail";
    }

//    글 수정 페이지로 이동
    @GetMapping("/updateForm")
    public String updateForm() {
        return "update_form";
    }

//    글 수정하기
    @PostMapping("/updateBoard")
    public String updateBoard() {
        return "redirect:/writeBoard";
    }
}
