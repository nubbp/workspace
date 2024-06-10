package class_basic.car;

public class Car {
//    제조사, 차이름, 차량번호, 가격, 소유주의 속성
    String brand;
    String modelName;
    String carNum; // 연산할 필요가 없는 숫자 => 문자열 취급해도 ㄱㅊ
    int price;
    String owner;

    public void setBrand(String b) {
        brand = b;
    }
    public void setModelName(String b) {
        modelName = b;
    }
    public void setCarNum(String b) {
        carNum = b;
    }
    public void setPrice(int b) {
        price = b;
    }
    public void setOwner(String b) {
        owner = b;
    }

    public void printCarInfo() {
        System.out.println("브랜드 : " + brand);
        System.out.println("차량이름 : " + modelName);
        System.out.println("차량번호 : " + carNum);
        System.out.println("가격 : " + price);
        System.out.println("소유주 : " + owner);
    }
}


