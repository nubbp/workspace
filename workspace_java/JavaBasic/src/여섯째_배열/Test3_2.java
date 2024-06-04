package 여섯째_배열;

public class Test3_2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int j;
        int max = 0;
        int min = 100;

        for (int i = 0; i < arr.length; i++) {
            j = (int)(Math.random() * 100 + 1);
            if (j >= 1 && j <= 100) {
                arr[i] = j;
                System.out.println(i + 1 + "번째 숫자: " + arr[i]);
                if (max < arr[i]) {
                    max = arr[i];
                }
                if (min > arr[i]) {
                    min = arr[i];
                }
            } else {
                i--;
            }
        }

        System.out.println("-----------");
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);



    }
}
