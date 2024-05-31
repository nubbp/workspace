package 네번째_조건문;

import java.util.Scanner;

public class If_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(1);
        } else if (num < 0) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }

    }
}
