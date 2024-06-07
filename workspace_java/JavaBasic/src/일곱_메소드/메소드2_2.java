package 일곱_메소드;

import java.util.Scanner;

public class 메소드2_2 {
    public static void main(String[] args) {
        System.out.println(m2());
    }

    public static int m2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 입력 : ");
        int a = sc.nextInt();
        System.out.print("두 번째 정수 입력 : ");
        int b = sc.nextInt();
        return a * b;
    }
}
