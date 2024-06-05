package 일곱_메소드;

import java.sql.SQLOutput;

public class Test1_7_10 {
    public static void main(String[] args) {
        System.out.println("-----7");
        test7(9, 7);
        System.out.println("-----8");
        test8("안녕","하세요");
        System.out.println("-----9");
        test9_name("김형진");
        test9_age(33);
        test9_addr("울산");
        System.out.println("-----10");
        test10("김형진", 33, "울산");
    }

    public static void test7(int a, int b) {
        System.out.println("나눗셈 몫 : " + a / b);
        System.out.println("나머지 : " + a % b);
    }

    public static void test8(String a, String b) {
        System.out.println(a + "+" + b);
    }

    public static void test9_name(String name) {
        System.out.println("이름은 " + name + "입니다.");
    }
    public static void test9_age(int age) {
        System.out.println("나이는 " + age + "살입니다.");
    }
    public static void test9_addr(String addr) {
        System.out.println("주소는 " + addr + "입니다.");
    }

    public static void test10(String name, int age, String addr) {
        System.out.println("이름은 " + name + "입니다.");
        System.out.println("나이는 " + age + "살입니다.");
        System.out.println("주소는 " + addr + "입니다.");
    }
}
