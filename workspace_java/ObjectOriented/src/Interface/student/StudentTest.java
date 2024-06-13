package Interface.student;

import Interface.math.MyMath;

public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student("김", 90, 90, 90);
        Student stu2 = new Student("이", 60, 70, 80);
        Student stu3 = new Student("박", 90, 90, 90);
        Student[] students = {stu1, stu2, stu3};

        MyStudent myStudent = new MyStudent();
        System.out.println(myStudent.getGradeByStudentName(students, "김"));


    }
}
