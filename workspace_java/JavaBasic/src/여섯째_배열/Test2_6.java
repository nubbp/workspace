package 여섯째_배열;

public class Test2_6 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        int[] newArr = new int[arr1.length + arr2.length];

        for (int i = 0; i < newArr.length; i++) {
            if (i < 3) {
                newArr[i] = arr1[i];
            } else if (i >= 3) {
                newArr[i] = arr2[i - arr1.length];
            }
            System.out.println("newArr 배열의 " + (i+1) + "번째 값: " + newArr[i]);
        }




    }
}
