package Interface.student;

import Interface.math.MyMath;

import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
        MyStudent myStudent = new MyStudent();
        Student stu1 = new Student("김", 90, 90, 90);
        Student stu2 = new Student("이", 60, 70, 80);
        Student stu3 = new Student("박", 80, 80, 80);
        Student stu4 = new Student("배", 54, 80, 89);

        Student[] students = { stu1, stu2, stu3, stu4 };
        System.out.println(myStudent.getGradeByStudentName(students, "이"));
        System.out.println("-----------");
        int[] getTotalScore = myStudent.getTotalScoresToArray(students);
        System.out.println(Arrays.toString(getTotalScore));
        System.out.println(Arrays.toString(myStudent.getTotalScoresToArray(students)));

        System.out.println("-----------");

        Student highScoreStudent = myStudent.getHighScoreStudent(stu1, stu3);
        System.out.println(highScoreStudent.getName());
        System.out.println(myStudent.getHighScoreStudent(stu2, stu4).toString());
    }
}
