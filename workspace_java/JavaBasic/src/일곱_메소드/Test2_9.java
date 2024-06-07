package 일곱_메소드;

public class Test2_9 {
    public static void main(String[] args) {
        System.out.println(m9(6));
    }

    public static int m9(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        return sum;
    }
}
