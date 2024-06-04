package 다섯_반복문.For;

public class Test14 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i < 101; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("");
        System.out.println("총 개수: " + count);
    }
}
