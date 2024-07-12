package Java_1.src.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 9 + 1);
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                }
            }
        }
        System.out.println("만들어진 숫자: " + Arrays.toString(arr));
        System.out.println("숫자를 정했습니다. 게임을 시작합니다.");


        for (int i = 0;;i++) {
            System.out.print((i+1) + " >> ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
//            int[] answer = new int[3];
//            반복문 중첩으로 돌려서 카운트

            int strikeCnt = 0;
            int ballCnt = 0;

            if (num1 == arr[0]) {
                strikeCnt++;
            } else if (num1 == arr[1] || num1 == arr[2]) {
                ballCnt++;
            }
            if (num2 == arr[1]) {
                strikeCnt++;
            } else if (num2 == arr[0] || num2 == arr[2]) {
                ballCnt++;
            }
            if (num3 == arr[2]) {
                strikeCnt++;
            } else if (num3 == arr[0] || num3 == arr[1]) {
                ballCnt++;
            }

            System.out.println(strikeCnt + "스트라이크 " + ballCnt + "볼");
            System.out.println();

            if (num1 == arr[0] && num2 == arr[1] && num3 == arr[2]) {
                System.out.println((i+1) + "회만에 정답을 맞췄습니다.");
                break;
            }
        }
    }
}
