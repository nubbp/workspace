package 여섯째_배열;

public class Test2_5 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] newArr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
            System.out.println("newArr 배열의 "+ (i+1) + "번째 값: " + newArr[i]);
        }

        System.out.println();

        for (int i : arr) {
            System.out.println("newArr 배열의 "+ (i+1) + "번째 값: " + i);
        }
    }
}
