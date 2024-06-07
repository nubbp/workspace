package 일곱_메소드;

public class 메소드_5 {
    public static void main(String[] args) {
        int result1 = getSum1(3, 5);
        System.out.println("getSum1 출력값 :" + result1);
        System.out.println("getSum1 출력값 :" + getSum1(20, 30));

        double result2 = getSum2(3, 5);
        System.out.println("getSum2 출력값 :" + result2);
    }

//    매개변수로 전달된 두 정수의 합을 리턴하는 메소드
    public static int getSum1(int a, int b) {
        return a + b;
    }

    //    매개변수로 전달된 두 정수의 합을 리턴하는 메소드
    public static double getSum2(int a, int b) {
        return a + (double)b;
    }
}
