package 일곱_메소드;

import java.util.Scanner;

public class Test1_11_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----11");
        System.out.print("정수 입력: ");
        int num1 = sc.nextInt();
        test11(num1);

        System.out.println("-----12");
        System.out.print("이름 입력: ");
        String name = sc.next();
        System.out.print("나이 입력: ");
        int age = sc.nextInt();
        System.out.print("주소 입력: ");
        String addr = sc.next();
        test12(name, age, addr);

        System.out.println("-----13");
        System.out.print("첫번째 정수 입력: ");
        int num2 = sc.nextInt();
        System.out.print("두번째 정수 입력: ");
        int num3 = sc.nextInt();
        test13(num2, num3);

    }

    public static void test11(int a) {
        System.out.println("입력받은 정수: " + a);
    }

    public static void test12(String name, int age, String addr) {
        System.out.println("이름은 " + name + "입니다.");
        System.out.println("나이는 " + age + "살입니다.");
        System.out.println("주소는 " + addr + "입니다.");
    }

    public static void test13(int a, int b) {
        System.out.println("정수 두 개의 합: " + (a + b));
    }
}
