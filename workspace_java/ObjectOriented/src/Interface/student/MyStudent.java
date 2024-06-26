package Interface.student;

import class_basic.class_3.Stu;

public class MyStudent implements StudentUtil {



    //    --첫번째 메소드--
//    메소드명: getGradeByStudentName()
//    첫번째 매개변수로 받은 다수의 학생 중
//    두번째 매개변수로 받은 이름을 가진 학생의 점수등급을 리턴
//    단, 전달받은 이름을 가진 학생이 없다면 점수등급은 "등급없음"이 된다
//    점수등급
//    90 <= 평균점수 <= 100 : "A" 등급
//    80 <= 평균점수 <=  89 : "B" 등급
//    70 <= 평균점수 <=  79 : "C" 등급
//    70  > 평균점수        : "D" 등급

    public String getGradeByStudentName(Student[] students, String name) {
        String grade = "등급없음";
        for (Student stu : students) {
            if (stu.getName().equals(name)) {
                double avg = (stu.getKorScore() + stu.getEngScore() + stu.getMathScore()) / 3.0;
                grade = getGradeByAvg(avg);
            }
        }
        return grade;
    }

    public String getGradeByAvg(double avg){
        String grade = "등급없음";
        if (avg >= 90 && avg < 100) {
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else {
            grade = "D";
        }
        return grade;
    }

    //    --두번째 메소드--
//    메소드명: getTotalScoresToArray
//    매개변수로 받은 다수의 학생들의 총점을 배열로 리턴

    public int[] getTotalScoresToArray(Student[] students) {
//        학생들의 총점이 저장될 배열 생성
        int[] totalArr = new int[students.length];

        for (int i = 0; i < students.length; i++) {
            totalArr[i] = students[i].getKorScore() + students[i].getEngScore() + students[i].getMathScore();
        }
        return totalArr;
    }

    //    --세번째 메소드--
//    메소드명: getHighScoreStudent
//    매개변수로 두 명의 학생이 전달된다
//    전달된 두 학생 중 총점이 높은 학생 객체를 리턴
//    단, 전달된 두 학생의 총점이 같은 경우는 없다고 가정
    public Student getHighScoreStudent(Student stu1, Student stu2) {
        int sum1 = stu1.getMathScore() + stu1.getKorScore() + stu1.getEngScore();
        int sum2 = stu2.getMathScore() + stu2.getKorScore() + stu2.getEngScore();
        return sum1 > sum2 ? stu1 : stu2;
    }
}
