package 네번째_조건문;

/*
    점수를 키보드로 입력받음 (정수)
    키보드로 입력 바은 점수가
    90~100 : A 출력
    80~89 : B 출력
    ...
    X > 70 D 출력
*/

import java.util.Scanner;

public class Switch_예제_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수 입력 : ");
        int num = sc.nextInt();

        switch (num/10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
            System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            default:
                System.out.println("D");
        }
    }
}
