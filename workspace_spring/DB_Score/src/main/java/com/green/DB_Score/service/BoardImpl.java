package com.green.DB_Score.service;

import com.green.DB_Score.vo.BoardVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("BoardService")
public class BoardImpl implements BoardService {
    @Autowired
    SqlSessionTemplate sqlSession;

    @Override
    public List<BoardVO> readBoard() {
        return sqlSession.selectList("boardMapper.readBoard");
    }

    @Override
    public void writeBoard(BoardVO boardVO) {
        sqlSession.insert("boardMapper.writeBoard", boardVO);
    }
}