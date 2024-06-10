package class_basic.member;

public class Member {
    String name;
    String id;
    String pw;
    int age;

    public void setAll(String name1, String id2, String pw3, int age4) {
        name = name1;
        id = id2;
        pw = pw3;
        age = age4;
    }

    public void printMemInfo() {
        System.out.println("------정보출력------");
        System.out.println("이름 : " + name);
        System.out.println("아이디 : " + id);
        System.out.println("비밀번호 : " + pw);
        System.out.println("나이 : " + age);
    }

    public void chanegeName(String a) {
        name = a;
    }

    public void printName() {
        System.out.println("-----변경한 이름 확인----");
        System.out.println("이름 : " + name);
    }
}
