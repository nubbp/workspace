package com.green.Board.service;

import com.green.Board.vo.ReplyVO;

import java.util.List;

public interface ReplyService {
    List<ReplyVO> getReplyList(int boardNum);
    void regReply(ReplyVO replyVO);
    void delReply(int replyNum);
    void delBoardReply(int boardNum);
}
