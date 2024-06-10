package class_basic.car;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "현대";
        c1.price = 7000;
        System.out.println(c1.brand);
        System.out.println(c1.price);

        System.out.println("----------------");

        Car c2 = new Car();
        c2.setBrand("기아");
        c2.setModelName("k3");
        c2.setCarNum("1111");
        c2.setPrice(1000);
        c2.printCarInfo();
    }
}
