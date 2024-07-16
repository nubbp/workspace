package com.green.ReactBoard.controller;

import com.green.ReactBoard.service.AxiosService;
import com.green.ReactBoard.vo.BoardVO;
import com.green.ReactBoard.vo.MemberVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AxiosController {
    @Resource(name="axiosService")
    private AxiosService axiosService;

    @GetMapping("/getList")
    public List<BoardVO> getList() {
        return axiosService.getList();
    }

    @PostMapping("/insertBoard")
    public void insertBoard(@RequestBody MemberVO memberVO) {
        System.out.println(1);
        System.out.println(memberVO);
    }

    @PutMapping("/updateBoard")
    public BoardVO updateBoard(@RequestBody BoardVO boardVO) {
        System.out.println(boardVO);
        return boardVO;
    }

    @GetMapping("/detail/{boardNum}")
    public List<BoardVO> detail(@PathVariable("boardNum") int boardNum) {
        System.out.println(boardNum);
        return axiosService.getList();
    }
}
