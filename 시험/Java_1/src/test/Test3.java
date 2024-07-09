package Java_1.src.test;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = { 5, 11, 20, 40, 30 };
        int max = 0; int min = 100;

        for(int e : arr) {
            max = e > max ? e : max;
            min = e < min ? e : min;
        }

        System.out.println("배열에서 가장 큰 값: " + max);
        System.out.println("배열에서 가장 작은 값: " + min);
    }
}
