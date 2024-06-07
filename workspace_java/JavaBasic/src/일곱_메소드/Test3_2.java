package 일곱_메소드;

public class Test3_2 {
    public static void main(String[] args) {
        m3(6);
    }

    public static void m3(int a) {
        for (int i = 1; i <= 100; i++) {
            if (i % a == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
