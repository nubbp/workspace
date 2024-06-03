package 네번째_조건문;

import java.util.Scanner;

public class Swicth_예제_1 {
    public static void main(String[] args) {
        // 키보드로 정수 하나를 입력받암
        Scanner sc =new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();

        switch (num%2) {
            case 0 :
                System.out.println(1);
                break;
            case 1 :
                System.out.println(2);
                break;
            default:
                System.out.println(0);
        }
    }
}
