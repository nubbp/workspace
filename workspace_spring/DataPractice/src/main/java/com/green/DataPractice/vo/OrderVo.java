package com.green.DataPractice.vo;

import java.util.Arrays;

public class OrderVo {
    private String chicken;
    private int chickenNum;
    private String[] extra;
    private String orderText;

    public String getChicken() {
        return chicken;
    }

    public void setChicken(String chicken) {
        this.chicken = chicken;
    }

    public int getChickenNum() {
        return chickenNum;
    }

    public void setChickenNum(int chickenNum) {
        this.chickenNum = chickenNum;
    }

    public String[] getExtra() {
        return extra;
    }

    public void setExtra(String[] extra) {
        this.extra = extra;
    }

    public String getOrderText() {
        return orderText;
    }

    public void setOrderText(String orderText) {
        this.orderText = orderText;
    }

    @Override
    public String toString() {
        return "OrderVo{" +
                "chicken='" + chicken + '\'' +
                ", chickenNum=" + chickenNum +
                ", extra=" + Arrays.toString(extra) +
                ", orderText='" + orderText + '\'' +
                '}';
    }
}
