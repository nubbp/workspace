package com.green.DataPractice.vo;

public class DeliveryVo {
    private String userName;
    private String userTel;
    private String userAddr;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    @Override
    public String toString() {
        return "DeliveryVo{" +
                "userName='" + userName + '\'' +
                ", userTel='" + userTel + '\'' +
                ", userAddr='" + userAddr + '\'' +
                '}';
    }
}
