package com.green.Car.service;

import com.green.Car.vo.SalesVO;

import java.util.List;

public interface SalesService {
//    판매 목록 불러오기
    List<SalesVO> getSalesList();
    void regSalesInfo(SalesVO salesVO);
}
