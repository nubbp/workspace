package 여섯째_배열;

public class Test2_2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            for (int j = 2; j < i; j++) {
                if (arr[i] / j == 0) {
                    System.out.println(arr[j]);
                }
            }
        }
        /*for (int j = 2; j < 100; j++) {
            if (arr[i] / j == 0) {
                System.out.println(arr[j]);
            }
        }*/

    }
}
