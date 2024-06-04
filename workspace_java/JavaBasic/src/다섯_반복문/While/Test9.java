package 다섯_반복문.While;

public class Test9 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        while (num <= 10) {
            sum = sum + num;
            num++;
        }
        System.out.println("1~10까지의 합: " + sum);
    }
}