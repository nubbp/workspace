package 일곱_메소드;

public class Test3_1 {
    public static void main(String[] args) {
        m2(5);
    }

    public static void m2(int a) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(a + " * " + i + " = " + (a * i));
        }
    }
}
