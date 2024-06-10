package class_basic;

public class Student {
    String name;
    int age;
    int score;

//    매개변수로 전달된 문자열로 name 값을 변경하는 메소드
    public String setName(String a) {
        name = a;
        return name;
    }

    public int setAge(int a) {
        if (a < 0) {
            age = 0;
        } else {
            age = a;
        }
        return age;
    }

    public void introduce() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("점수 : " + score);
    }
}
