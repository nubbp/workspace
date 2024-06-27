package com.green.DB_Score.service;

import com.green.DB_Score.vo.DbScoreVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("DbScoreService")
public class DbScoreImpl implements DbScoreService {

    List<DbScoreVO> vo = new ArrayList<>();

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public List<DbScoreVO> getStuList() {
        return sqlSession.selectList("scoreMapper.getList");
    }

    @Override
    public void regStu(DbScoreVO dbScoreVO) {
        sqlSession.insert("scoreMapper.insert", dbScoreVO);
    }


}
