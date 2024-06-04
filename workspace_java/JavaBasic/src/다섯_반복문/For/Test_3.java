package 다섯_반복문.For;

public class Test_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i;

        for (i = 1; ; i++) {
            sum += i;
            if (sum > 300) {
                break;
            }
        }
        System.out.println("합: " + sum);
        System.out.println("마지막으로 더해진 값: " + i);
    }
}