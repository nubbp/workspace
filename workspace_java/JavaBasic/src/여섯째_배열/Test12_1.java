package 여섯째_배열;

import java.util.Scanner;

public class Test12_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        { 국어, 영어, 수학, 총점 };
        int[] scores = new int[4];
//        과목명
        String[] subjects = { "국어", "영어", "수학" };

//        평균
        double avg;

//        점수입력(0~100점 입력까지 무한 입력)
        for (int i = 0; i < scores.length - 1; i++) {
            while (true) {
                System.out.print(subjects[i] + " 점수: ");
                scores[i] = sc.nextInt();
                if (scores[i] >= 0 && scores[i] <= 100){
                    scores[scores.length - 1] += scores[i];
                    break;
                }
            }
        }

        System.out.println("------ 입력한 정보입니다 ------");
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + " 점수: " + scores[i]);
        }
        System.out.println("총점: " + scores[scores.length - 1]);
        avg = scores[scores.length - 1] / (double)(scores.length - 1);
        System.out.println("평균: " + avg);
    }
}
