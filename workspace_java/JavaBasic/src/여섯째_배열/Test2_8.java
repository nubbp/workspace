package 여섯째_배열;

public class Test2_8 {
    public static void main(String[] args) {
        int[] arr = new int[6];

        double j;

        for (int i = 0; i < arr.length; i++) {
            j = 100 * Math.random() + 1;
            if (j >= 1 && j <= 45) {
                arr[i] = (int)j;
                System.out.print(arr[i] + " ");
            } else {
                i--;
            }
        }
    }
}
