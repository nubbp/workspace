package com.green.BasicBoard.controller;

import com.green.BasicBoard.service.BoardImpl;
import com.green.BasicBoard.vo.BoardVO;
import com.green.BasicBoard.vo.SearchVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BoradController {

    @Resource(name = "BoardService")
    private BoardImpl board;

//    board_list 불러오기
   @RequestMapping("/")
    public String boradList(Model model, SearchVO searchVO) {

//        searchVO 데이터 검사
        System.out.println(searchVO);

//       목록 조회
        List<BoardVO> boardList = board.readBoard(searchVO);
        model.addAttribute("boardList", boardList);
        return "board_list";
    }

//    write_form 불러오기
    @GetMapping("/writeForm")
    public String writeForm() {
        return "board_write_form";
    }

//    게시글 작성
    @PostMapping("writeBoard")
    public String writeBoard(BoardVO boardVO) {
        board.writeBoard(boardVO);
        return "redirect:/";
    }

//    board_detail 불러오기
    @GetMapping("boardDetail")
    public String boardDetail(@RequestParam(name = "boardNum") int boardNum, Model model) {
        BoardVO boardVO = board.readOneBoard(boardNum);
        model.addAttribute("board", boardVO);
        return "board_detail";
    }

//    update_form 불러오기
    @GetMapping("updateForm")
    public String updateForm(@RequestParam(name = "boardNum") int boardNum, Model model) {
        BoardVO boardVO = board.readOneBoard(boardNum);
        model.addAttribute("board", boardVO);
        return "update_form";
    }

//    수정정보 저장 후 상세페이지로 이동
    @PostMapping("updateBoard")
    public String updateBoard(BoardVO boardVO) {
        board.updateBoard(boardVO);
        return "redirect:/boardDetail?boardNum="+boardVO.getBoardNum();
    }

}
