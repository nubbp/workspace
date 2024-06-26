package com.green.DB_Score.service;

import com.green.DB_Score.vo.DbScoreVO;

import java.util.List;

public interface DbScoreService {

    List<DbScoreVO> getStuList();
    void regStu(DbScoreVO dbScoreVO);
    DbScoreVO getStuDetail(int stuNum);
    void updateStu(DbScoreVO dbScoreVO);
    void deleteStu(int stuNum);
}
