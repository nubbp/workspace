package com.green.Car.controller;

import com.green.Car.service.CarService;
import com.green.Car.vo.CarVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    @Resource(name = "carService")
    private CarService carService;

//    차량 목록 불러오기
    @GetMapping("/getCarList")
    public List<CarVO> getCarList() {
        return carService.getCarList();
    }

//    차량 등록하기
    @PostMapping("/regCar")
    public void regCar(@RequestBody CarVO carVO) {
        System.out.println(carVO);
        carService.regCar(carVO);
    }
}
