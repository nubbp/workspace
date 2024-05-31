package 네번째_조건문;
import java.util.Scanner;

public class 예제_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();

        if (num > 10) {
            System.out.println("10보다 큽니다.");
        }
    }
}
