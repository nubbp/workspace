package com.green.Board.controller;

import com.green.Board.service.ReplyService;
import com.green.Board.vo.ReplyVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/reg")
    public void regReply(@RequestBody ReplyVO replyVO) {
        System.out.println(replyVO);
        replyService.regReply(replyVO);
    }
}
