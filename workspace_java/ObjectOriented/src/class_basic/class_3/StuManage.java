package class_basic.class_3;

import java.awt.*;
import java.util.Scanner;

public class StuManage {
    private Scanner sc; // 키보드 입력을 위해 선언
    private Stu[] students; // 학생 다수를 저장할 배열
    private int idx; // 학생 배열의 요소 카운트

//    생성자
    public StuManage() {
        sc = new Scanner(System.in);
        students = new Stu[3];
        idx = 0;
    }

//    학생 등록 메소드
    public void regInfo() {
        if (idx >= 3) {
            System.out.println("더 이상 학생을 추가할 수 없음");
        } else {
            System.out.println("학생 등록");
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("나이 : ");
            int age = sc.nextInt();
            System.out.print("연락처 : ");
            String tel = sc.next();
            System.out.print("학점 : ");
            String grade = sc.next();

//        입력받은 정보로 학생 정보 저장
            Stu stu = new Stu(name, age, grade, tel);

//        생성한 학생 객체를 배열에 저장
            students[idx] = stu;
            idx++;
        }
    }

    public void changeInfo() {
        System.out.println("정보 변경 실행");
        System.out.print("변경 학생: ");
        String name = sc.next();
        for (int i = 0; i < idx; i++) {
            if (!students[i].getName().equals(name)) {
                System.out.println("해당하는 학생이 존재하지 않습니다. 다시 입력하세요.");
            } else {
                System.out.print("연락처: ");
                String tel = sc.next();
                students[i].setTel(tel);
                System.out.println("변경 완료되었습니다.");
            }
        }
    }

    public void print() {
        System.out.println("학생 정보 출력");
        System.out.print("정보를 열람할 학생: ");
        String name = sc.next();
        for (int i = 0; i < idx; i++) {
            if (students[i].getName().equals(name)) {
                students[i].showInfo();
                System.out.println();
            }
        }
    }

    public void printAll() {
        System.out.println("모든 학생의 정보입니다. 현재 학생 수는 " + idx + "명입니다.");

        for (int i = 0; i < idx; i++) {
            students[i].showInfo();
            System.out.println();
        }
    }
}
