package 일곱_메소드;

public class Test2_3 {
    public static void main(String[] args) {
        System.out.println(m3(5, 6));
    }

    public static int m3(int a, int b) {
        int max = a >= b ? a : b;
//        int min = a < b ? a : b;
        return max;
    }
}
