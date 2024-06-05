package 일곱_메소드;

public class Test1_4_6 {
    public static void main(String[] args) {
        test4("ㅇㅇ");
        test5(2, 54);
        test6(2, 54, 4);
    }

    public static void test4(String a) {
        System.out.println(a);
    }
    public static void test5(int a, int b) {
        System.out.println(a + b);
    }
    public static void test6(int a, int b, int c) {
        System.out.println(a * b * c);
    }
}
