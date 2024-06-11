package class_basic.class_3;

//배열 + 클래스
public class StuTest {
    public static void main(String[] args) {
//        학생을 5명 저장할 수 있는 배열 생성
        Student[] students = new Student[5];

//        배열에 저장할 학생 객체 생성
        Student s1 = new Student("홍길동", 20, 90);
        Student s2 = new Student("김길동", 21, 85);
        Student s3 = new Student("이길동", 22, 80);
        Student s4 = new Student("박길동", 23, 75);
        Student s5 = new Student("고길동", 24, 70);

//        배열 요소에 학생 저장
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

//        1. 배열에 저장된 모든 학생의 이름, 나이, 점수를 출력
        /*for (int i = 0; i < students.length; i++) {
            students[i].printStudent();
            System.out.println();
        }
        System.out.println("-----------------------");
        System.out.println();*/

//        1번 문제를 for-each문으로 풀기
        for (Student e : students) {
            e.printStudent();
            System.out.println();
        }


//        2. 배열에 저장된 학생 중 점수가 80점 이상인 학생의 이름, 나이, 점수 출력
        for (int i = 0; i < students.length; i++) {
            if (students[i].getScore() >= 80) {
                students[i].printStudent();
                System.out.println();
            }
        }

        System.out.println("-----------------");
        System.out.println();

//        3. 이름이 '박길동'인 학생을 찾아 해당 학생의 나이를 10으로 변경
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals("박길동"))  {
                students[i].setAge(10);
                students[i].printStudent();
            }
        }

        System.out.println();

        for (Student s : students) {
            if (s.getName().equals("고길동"))  {
                s.setAge(50);
                s.printStudent();
            }
        }
    }
}
