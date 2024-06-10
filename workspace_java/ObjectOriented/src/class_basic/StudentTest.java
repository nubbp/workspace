package class_basic;

public class StudentTest {
    public static void main(String[] args) {
//        학생 객체 stu1 생성
        Student stu1 = new Student();

//        stu1이라는 학생의 이름 출력
        System.out.println(stu1.name);

//        stu1 학생의 모든 정보 출력
        stu1.introduce();

        System.out.println("-----------");

        stu1.setName("kim");
        stu1.introduce();

        System.out.println("-----------");

        stu1.age = -30;
        stu1.introduce();

        System.out.println("-----------");

        stu1.setAge(-30);
        stu1.introduce();
    }
}
