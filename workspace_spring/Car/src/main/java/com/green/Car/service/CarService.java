package com.green.Car.service;

import com.green.Car.vo.CarVO;

import java.util.List;

public interface CarService {
//    차량 목록 불러오기
    List<CarVO> getCarList();

//    차량 등록하기
    void regCar(CarVO carVO);
}
