package com.green.Car.controller;

import com.green.Car.service.SalesService;
import com.green.Car.vo.SalesVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SalesController {
    @Resource(name = "salesService")
    private SalesService salesService;

    @GetMapping("/getSalesList")
    public List<SalesVO> getSalesList() {
        return salesService.getSalesList();
    }
}
