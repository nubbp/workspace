package com.green.Board.controller;

import com.green.Board.service.ReplyService;
import com.green.Board.vo.ReplyVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reply")
public class ReplyController {

    @Resource(name = "replyService")
    private ReplyService replyService;

//    게시글 목록
    @GetMapping("/list/{boardNum}")
    public List<ReplyVO> getReplyList(@PathVariable("boardNum") int boardNum) {
        System.out.println(boardNum);
        return replyService.getReplyList(boardNum);
    }
}
