package 여섯째_배열;

public class Test11 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                count++;
            }
        }

        System.out.println();

        for (int i  : arr) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println();
        System.out.println(count + "개");
    }
}
