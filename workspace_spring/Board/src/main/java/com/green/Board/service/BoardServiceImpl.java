package com.green.Board.service;

import com.green.Board.vo.BoardVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public List<BoardVO> getBoardList() {
        return sqlSession.selectList("boardMapper.getBoardList");
    }

    @Override
    public BoardVO getBoardDetail(int boardNum) {
        return sqlSession.selectOne("boardMapper.getBoardDetail", boardNum);
    }

    @Override
    public void regBoard(BoardVO boardVO) {
        sqlSession.insert("boardMapper.regBoard", boardVO);
    }p

    @Override
    public void deleteBoard(int boardNum) {
        sqlSession.delete("replyMapper.delBoardReply", boardNum);
        sqlSession.delete("boardMapper.deleteBoard", boardNum);
    }
}
