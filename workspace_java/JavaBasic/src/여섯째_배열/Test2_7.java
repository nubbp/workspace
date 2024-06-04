package 여섯째_배열;

public class Test2_7 {
    public static void main(String[] args) {
        int i = 0;
        double j;

        for (;;) {
            j = 100 * Math.random() + 1;
            if (j >= 50 && j < 100) {
                i = (int)j;
                break;
            }
        }

        System.out.println(i);
    }
}
