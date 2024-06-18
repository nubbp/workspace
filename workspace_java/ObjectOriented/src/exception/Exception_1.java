package exception;

import java.util.Scanner;

// 예외처리
/*
    예외처리 문법
    try {
        예외가 발생할 수도 있는 코드 작성
    } catch(Exception e) {
        에외 발생 시 실행 코드 작성
    } finally {
        예외 발생 여부와 관게없이 무조건 실행할 코드
    }
*/
public class Exception_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("첫 번째: ");
            int a = sc.nextInt();
            System.out.print("두 번째: ");
            int b = sc.nextInt();

            System.out.println(a/b);
        } catch (Exception e) { // 예외에 대한 정보가 들어있는 클래스
            System.out.println("오류 발생");
            // 예외발생이유를 간략히 문자열로 전달
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("프로그램 종료");
        }


    }
}
