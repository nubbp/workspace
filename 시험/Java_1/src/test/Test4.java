package Java_1.src.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1~999까지의 임의의 정수 입력: ");
        int num = sc.nextInt();

//        백의 자리
        int hundred = num / 100;
//        십의 자리
//        int ten = (num - hundred * 100) / 10;
        int ten = (num % 100) / 10;
//        일의 자리
//        int one = num - hundred * 100 - ten * 10;
        int one = num % 10;

        int cnt = 0;

        if (hundred == 3 || hundred == 6 || hundred == 9 ) {
            cnt++;
        }
        if (ten == 3 || ten == 6 || ten == 9 ) {
            cnt++;
        }
        if (one == 3 || one == 6 || one == 9 ) {
            cnt++;
        }

        System.out.println("백의 자리: " + hundred + ", 십의 자리: " + ten + ", 일의 자리: " + one);
        System.out.println("박수 " + cnt + "번");
    }
}
