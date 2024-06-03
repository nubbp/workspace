package 다섯_반복문.While;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.print("정수 입력 : ");
        int num = sc.nextInt();

        while (num >= 1) {
            if (num % 2 == 0) {
//                System.out.println(num);
                count++;
            }
            num--;
        }
        System.out.println("총 " + count + "개");

    }
}
