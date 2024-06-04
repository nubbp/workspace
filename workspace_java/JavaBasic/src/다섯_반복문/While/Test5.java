package 다섯_반복문.While;

public class Test5 {
    public static void main(String[] args) {
        int i =2;
        while (i <= 10) {
            System.out.print(i + " ");
            i += 2;
        }

        System.out.println("");

        int j = 2;
        while (j < 11) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
            j++;
        }
    }
}