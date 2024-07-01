package com.green.BasicBoard.service;

import com.green.BasicBoard.vo.BoardVO;
import com.green.BasicBoard.vo.SearchVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("BoardService")
public class BoardImpl implements BoardService {
    @Autowired
    SqlSessionTemplate sqlSession;

    @Override
    public List<BoardVO> readBoard(SearchVO searchVO) {
        return sqlSession.selectList("boardMapper.readBoard", searchVO);
    }

    @Override
    public void writeBoard(BoardVO boardVO) {
        sqlSession.insert("boardMapper.writeBoard", boardVO);
    }

    @Override
    public BoardVO readOneBoard(int num) {
        return sqlSession.selectOne("boardMapper.readOneBoard",num);
    }

    @Override
    public void updateBoard(BoardVO boardVO) {
        sqlSession.update("boardMapper.updateBoard", boardVO);
    }
}