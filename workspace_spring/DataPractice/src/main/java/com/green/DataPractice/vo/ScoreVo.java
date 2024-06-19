package com.green.DataPractice.vo;

public class ScoreVo {
    private String user;
    private String grade;
    private String phone1;
    private String phone2;
    private String gender;
    private int korScore;
    private int engScore;
    private int mathScore;
    private double avg;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getKorScore() {
        return korScore;
    }

    public void setKorScore(int korScore) {
        this.korScore = korScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = (korScore + engScore + mathScore)/3.0;
    }

    @Override
    public String toString() {
        return "ScoreVo{" +
                "user='" + user + '\'' +
                ", grade='" + grade + '\'' +
                ", phone1='" + phone1 + '\'' +
                ", phone2='" + phone2 + '\'' +
                ", gender='" + gender + '\'' +
                ", korScore=" + korScore +
                ", engScore=" + engScore +
                ", mathScore=" + mathScore +
                ", avg=" + avg +
                '}';
    }
}
