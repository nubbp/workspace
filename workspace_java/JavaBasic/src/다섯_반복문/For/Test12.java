package 다섯_반복문.For;

public class Test12 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                count++;
            }
        }

        System.out.println("총 개수: " + count);
    }
}
