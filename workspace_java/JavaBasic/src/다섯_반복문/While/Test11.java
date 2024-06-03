package 다섯_반복문.While;

public class Test11 {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        while (i <= 100) {
            if (i % 3 == 0) {
                count++;
            }
            i++;
        }
        System.out.println("총 " + count + "개");
    }
}
