package 세번째_연산자;

// 534자루의 연필을 30명의 학생들에게 똑같이 나누어 주었을 때
// 학생 당 몇 개씩 가질 수 있고, 최종적으로 몇 개가 남는지 구하는 코드를 작성
// 빈 칸에 알맞는 코드를 작성하시오.

public class 초등산수문제 {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;

        int pencilPerStudent = pencils / students;
        int pencilsLeft = pencils % students;

        System.out.println("학생 한 명이 가지는 연필의 수: " + pencilPerStudent);
        System.out.println("나눠주고 남은 연필의 수 : " + pencilsLeft);

    }
}
