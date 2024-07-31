package com.green.Board.service;

import com.green.Board.vo.BoardVO;
import com.green.Board.vo.PageVO;
import com.green.Board.vo.SearchVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public List<BoardVO> getBoardList(PageVO pageVO) {
        return sqlSession.selectList("boardMapper.getBoardList");
    }

    @Override
    public BoardVO getBoardDetail(int boardNum) {
        return sqlSession.selectOne("boardMapper.getBoardDetail", boardNum);
    }

    @Override
    public void regBoard(BoardVO boardVO) {
        sqlSession.insert("boardMapper.regBoard", boardVO);
    }

    @Override
    public void deleteBoard(int boardNum) {
        sqlSession.delete("replyMapper.delBoardReply", boardNum);
        sqlSession.delete("boardMapper.deleteBoard", boardNum);
    }

    @Override
    public void updateBoard(BoardVO boardVO) {
        sqlSession.update("boardMapper.updateBoard", boardVO);
    }

    @Override
    public int getBoardCnt() {
        return sqlSession.selectOne("boardMapper.getBoardCnt");
    }

/*    @Override
    public List<BoardVO> getSearchList(SearchVO searchVO) {
        return sqlSession.selectList("boardMapper.getSearchList", searchVO);
    }*/


}
