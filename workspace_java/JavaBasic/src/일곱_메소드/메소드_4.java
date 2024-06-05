package 일곱_메소드;

public class 메소드_4 {
    public static void main(String[] args) {
        introduce("ddd", 33, "울산");

        String a = "홍길동";
        int b = 22;
        String c = "서울";

        introduce(a, b, c);
    }

    public static void introduce(String name, int age, String addr) {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + addr);
    }
}
