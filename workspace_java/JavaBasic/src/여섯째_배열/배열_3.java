package 여섯째_배열;

public class 배열_3 {
    public static void main(String[] args) {
        // 정수 5개를 저장할 수 있는 배열 arr1을 생성
        int[] arr1 = new int[5]; // 0, 0, 0, 0, 0 저장돼있음
        System.out.println(arr1); // 이상한 값이 나옴
        int[] arr2 = {1,2,3,4,5};
        System.out.println(arr2[0]); // 이상한 값이 나옴

        System.out.println("---------------");

        for (int i = 0; i < 5; i++) {
            System.out.print(arr1[i]);
        }

        System.out.println();
        System.out.println("---------------");

        for (int j = 0; j < 5; j++) {
            System.out.print(arr2[j]);
        }

        System.out.println();
        System.out.println("---------------");

        int[] arr3 = new int[2];
        int[] arr4 = new int[5];
        int[] arr5 = new int[10];

        System.out.println(arr3.length);

    }
}
