package com.green.Car.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("salesService")
public class SalesService {
    @Autowired
    private SqlSessionTemplate sqlSession;
}
