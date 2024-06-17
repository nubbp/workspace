package collection.test2;

import java.util.ArrayList;
import java.util.List;

public class StudyClass {
    private List<Student> studentList;
    private String className;
    private String teacher;

    public StudyClass() {
        studentList = new ArrayList<>();
    }

    public StudyClass(List<Student> studentList, String className, String teacher) {
        this.studentList = studentList;
        this.className = className;
        this.teacher = teacher;
    }

    public void printStudent() {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
    }

    public double returnAvg() {
        int sum = 0;
        for (Student e : studentList) {
            sum += e.getScore();
        }
        return (double)sum / studentList.size();
    }

    public Student highScoreStudent() {
        int max = 0;
        Student highScore = null;
        for (Student e : studentList) {
            if (max < e.getScore()) {
                max = e.getScore();
            }
            if (max == e.getScore()) {
                highScore = e;
            }
        }
        return highScore;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public String getClassName() {
        return className;
    }

    public String getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return "StudyClass{" +
                "studentList=" + studentList +
                ", className='" + className + '\'' +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}
