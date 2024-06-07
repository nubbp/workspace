package 일곱_메소드;

public class Test3_6 {
    public static void main(String[] args) {
        int[] arr = {1, 7, 9, 2, 5};
        System.out.println(m6(arr));
    }

    public static int m6(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            max = a[i] > max ? a[i] : max;
        }
        return max;
    }
}
