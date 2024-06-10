package class_basic.man;

public class ManTest {
    public static void main(String[] args) {
        Man m1 = new Man("ddd", 33, "aaa");

        m1.printMan();
        System.out.println("--------------");;
        m1.setName("sda");
        m1.setAge(534);
        m1.setAddr("ddd");
        m1.printMan();
        System.out.println("--------------");
        System.out.println(m1.getName());

    }
}
