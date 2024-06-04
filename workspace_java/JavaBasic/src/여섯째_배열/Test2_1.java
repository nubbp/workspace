package 여섯째_배열;

import java.util.Scanner;

public class Test2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int total = 0;
        double avg = 0;
//        System.out.println(arr.length + "개 저장");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + i;
//            System.out.println(arr[i]);
            total += arr[i];
        }

        avg = (double)total / arr.length;

        System.out.println(avg);

    }
}
