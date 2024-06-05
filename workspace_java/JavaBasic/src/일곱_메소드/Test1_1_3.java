package 일곱_메소드;

public class Test1_1_3 {
    public static void main(String[] args) {
        System.out.println("1.");
        test1();
        System.out.println("2.");
        test2_1();
        test2_2();
        System.out.println("3.");
        test3(15);
    }

//    1번 메소드
    public static void test1() {
        System.out.println("안녕하세요");
    }

//    2번 메소드
    public static void test2_1() {
        System.out.println("반갑습니다");
    }
    public static void test2_2() {
        System.out.println("어서오세요");
    }

//    3번 메소드
    public static void test3(int num) {
        System.out.println("숫자: " + num);
    }
}
