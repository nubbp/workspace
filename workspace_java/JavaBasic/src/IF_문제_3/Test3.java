package IF_문제_3;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1~99 사이의 정수를 입력하시오 >> ");
        int num = sc.nextInt();

        int a = num % 10; // 일의 자리
        int b = num / 10; // 십의 자리
        int clapCnt = 0; //박수횟수

        if (a == 3 || a == 6 || a == 9){
            clapCnt++;
        }
        if (b == 3 || b == 6 || b == 9) {
            clapCnt++;
        }

        switch (clapCnt) {
            case 1:
                System.out.println("박수짝");
                break;
            case 2:
                System.out.println("박수짝짝");
                break;
            default:
                System.out.println("-");
        }

    }
}
