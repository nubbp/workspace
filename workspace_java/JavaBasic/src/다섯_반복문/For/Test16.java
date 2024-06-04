package 다섯_반복문.For;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        System.out.print("정수 입력 : ");
        for (int num = sc.nextInt() ; num > 1; num--) {
            if (num % 2 == 0) {
                count++;
            }
        }
        System.out.println("총 개수: " + count);
    }
}
