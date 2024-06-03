package 다섯_반복문.While;

public class While_3 {
    public static void main(String[] args) {

        // 1부터 10까지 숫자 출력
        int i = 10;

        while (i >= 0) {
            System.out.println(i);
            i--;
        }

        // 1부터 20까지 홀수만 출력
        int j = 1;

        while (j <=20) {
            System.out.println(j);
            j += 2;
        }

        // 1부터 5까지의 수 중에서 짝수만 출력
        int x = 1;

        while (x <= 5) {
            // 짝수만 출력
            if (x % 2 == 0) {
                System.out.println(x);
            }
            x++;
        }
    }
}
