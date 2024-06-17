package collection.test2;

import 상속.E;

import java.util.ArrayList;
import java.util.List;

public class SchoolTest {
    public static void main(String[] args) {

//        1반(길동반)
        Student s11 = new Student("김길동", 15, 90);
        Student s12 = new Student("이길동", 15, 80);
        Student s13 = new Student("박길동", 15, 70);
        List<Student> stuList1 = new ArrayList<>();
        StudyClass class1 = new StudyClass(stuList1, "길동반", "길동쌤");
        stuList1.add(s11);
        stuList1.add(s12);
        stuList1.add(s13);

//        2반(철수반)
        Student s21 = new Student("김철수", 15, 95);
        Student s22 = new Student("이철수", 15, 85);
        Student s23 = new Student("박철수", 15, 75);
        List<Student> stuList2 = new ArrayList<>();
        StudyClass class2 = new StudyClass(stuList2, "철수반", "철수쌤");
        stuList2.add(s21);
        stuList2.add(s22);
        stuList2.add(s23);

//        3반(자바반)
        Student s31 = new Student("김자바", 15, 92);
        Student s32 = new Student("이자바", 15, 59);
        Student s33 = new Student("박자바", 15, 78);
        List<Student> stuList3 = new ArrayList<>();
        StudyClass class3 = new StudyClass(stuList3, "자바반", "자바쌤");
        stuList3.add(s31);
        stuList3.add(s32);
        stuList3.add(s33);

//        학교 안에 교실 집어넣기
        List<StudyClass> classList = new ArrayList<>();
        classList.add(class1);
        classList.add(class2);
        classList.add(class3);

        School school = new School(classList);

        System.out.println("1-1) 길동반 ");
        class1.printStudent();
        System.out.println();

        System.out.println("1-2) 철수반 평균 성적");
        System.out.println(class2.returnAvg());
        System.out.println();

        System.out.println("1-3) 자바반 최고점수 학생");
        System.out.println(class3.highScoreStudent());
        System.out.println();

        System.out.println("2-1)");
        school.printClassStudent("자바쌤");
        System.out.println();

/*//        학교 안의 모든 학생 출력
        for (int i = 0; i < classList.size(); i++) {
            for (int j = 0; j < school.getClassList().get(i).getStudentList().size(); j++) {
                //
            }
        }*/
    }
}
