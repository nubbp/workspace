package com.green.Car.service;

import com.green.Car.vo.CarVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("carService")
public class CarServiceImpl implements CarService {

    @Autowired
    private SqlSessionTemplate sqlSession;

//    차량 목록 불러오기
    @Override
    public List<CarVO> getCarList() {
        return sqlSession.selectList("carMapper.getCarList");
    }

//    차량 등록하기
    @Override
    public void regCar(CarVO carVO) {
        sqlSession.insert("carMapper.regCar", carVO);
    }
}
