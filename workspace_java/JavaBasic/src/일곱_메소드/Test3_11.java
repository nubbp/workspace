package 일곱_메소드;

import java.util.Arrays;

public class Test3_11 {
    public static void main(String[] args) {
        int[] arr1 = {1};
        int[] arr2 = {10};
        m11(arr1, arr2);
    }

    public static void m11(int[] a, int[] b) {
        int[] blank = b;
        b = a;
        a = blank;

        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));
    }
}
