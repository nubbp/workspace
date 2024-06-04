package 여섯째_배열;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sub = {"국어", "수학", "영어"};
        int[] score = new int[sub.length];
        int total = 0; double avg = 0;

        for (int i = 0; i < sub.length; i++) {
            System.out.print(sub[i] + " 점수 입력: ");
            score[i] = sc.nextInt();
            total += score[i];
        }

        System.out.println("------------------");

        for (int j = 0; j < sub.length; j++) {
            System.out.println(sub[j] + " 점수: " + score[j]);
        }
        avg = (double)total / sub.length;

        System.out.println("총점: " + total);
        System.out.println("평균: " + avg);
    }
}
