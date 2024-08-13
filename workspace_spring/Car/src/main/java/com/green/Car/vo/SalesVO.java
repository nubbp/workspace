package com.green.Car.vo;

import lombok.Data;

@Data
public class SalesVO {
    private int salesNum;
    private String buyerName;
    private String buyerPhone;
    private String color;
    private String saleDate;
    private int modelNum;
    private CarVO car;
}
