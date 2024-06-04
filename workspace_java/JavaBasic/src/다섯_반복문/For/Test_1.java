package 다섯_반복문.For;

public class Test_1 {
    public static void main(String[] args) {
       /* int i = 0;

        for (int j = 0; j < 10; j++) {
            i = i + j;
        }
        System.out.println(i);*/

        // for 반복문 안에 j 없음



        for (int i = 1 ; i < 100 ; i++) {
            if (i % 7 == 0 || i % 9 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
