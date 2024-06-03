package 다섯_반복문.While;

public class Test13 {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;

        while (i <= 100) {
            if (i % 5 == 0) {
                System.out.println(i);
                count++;
            }
            i++;
        }
        System.out.println("총 " + count + "개");
    }
}
