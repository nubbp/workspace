package 네번째_조건문;

import java.util.Scanner;

public class 예제_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(1);
        }
    }
}
