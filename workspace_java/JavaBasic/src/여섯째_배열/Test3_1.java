package 여섯째_배열;

public class Test3_1 {
    public static void main(String[] args) {
        int max = 0;
        int[] array = {1,5,3,8,2};

        // 작성위치
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        System.out.println("max: " + max);
    }
}
