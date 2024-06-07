package 일곱_메소드;

import java.util.Arrays;

public class Test3_9 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] result = m9(arr);
        System.out.println(Arrays.toString(result));

    }

    public static int[] m9(int[] a) {
        int sum = 0;
        for (int e : a) {
            if (e % 2 == 0) {
                sum++;
            }
        }
        int[] result = new int[sum];
        int resultCnt = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                result[resultCnt] = a[i];
                resultCnt++;
            }
        }

        return result;
    }
}
