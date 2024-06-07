package 일곱_메소드;

import java.util.Arrays;

public class Test3_8 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6,7};
        System.out.println(Arrays.toString(m8(arr1, arr2)));
    }

    public static int[] m8(int[] a, int[] b) {
        int[] arr = new int[a.length + b.length];
        for (int i = 0; i < a.length + b.length; i++) {
            if (i < a.length) {
                arr[i] = a[i];
            } else {
                arr[i] = b[i - a.length];
            }
        }
        return arr;
    }
}
