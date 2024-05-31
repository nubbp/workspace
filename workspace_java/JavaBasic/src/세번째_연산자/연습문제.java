package 세번째_연산자;
import java.util.Scanner;
/*
    키보드로 이름, 국어점수, 영어점수, 수학점수를 입력받는다.
    단, 점수들은 정수만 입력한다고 가정한다.
    모든 정보를 입력받은 후 입력받은 이름, 국어점수, 영어점수, 수학점수와 총점 및 평균을 출력하는 코드를 작성.
*/
public class 연습문제 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("키보드로 이름, 국어점수, 영어점수, 수학점수를 차례로 입력");
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("국어점수 : ");
        int kor = sc.nextInt();
        System.out.print("영어점수 : ");
        int eng = sc.nextInt();
        System.out.print("수학점수 : ");
        int math = sc.nextInt();

        int total = kor + eng + math;
        double average = total / 3.0;

        System.out.println("-------------입력 결과-------------");
        System.out.println("이름 : " + name);
        System.out.println("국어점수 : " + kor);
        System.out.println("영어점수 : " + eng);
        System.out.println("수학점수 : " + math);
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + average);
    }
}
