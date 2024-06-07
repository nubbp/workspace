package 일곱_메소드;

public class Test3_10 {
    public static void main(String[] args) {
        m10(1,10);
    }

    public static void m10(int a, int b) {
        int blank = b;
        b = a;
        a = blank;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
