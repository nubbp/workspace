package com.green.Car.service;

import com.green.Car.vo.SalesVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("salesService")
public class SalesServiceImpl implements SalesService {

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public List<SalesVO> getSalesList() {
        return sqlSession.selectList("salesMapper.getSalesList");
    }
}
