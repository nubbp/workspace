package IF_문제_2;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("국어점수 : ");
        int kor = sc.nextInt();
        System.out.print("영어점수 : ");
        int eng = sc.nextInt();
        System.out.print("수학점수 : ");
        int math = sc.nextInt();

        int total = kor + eng + math;
        double average = total / 3.0;

        System.out.println("국어점수 : " + kor);
        System.out.println("영어점수 : " + eng);
        System.out.println("수학점수 : " + math);
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + average);
    }
}
