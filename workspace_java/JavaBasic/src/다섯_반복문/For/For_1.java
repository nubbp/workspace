package 다섯_반복문.For;

public class For_1 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        int sum = 0;
        for (int j = 1 ; j < 11 ; j++) {
            sum = sum + j;
        }
        System.out.println("총 합: " + sum);

        ///////////////////////////////////////

        /*int i = 1;

        while (i < 11) {
            System.out.println(i);
            i++;
        }*/
    }
}