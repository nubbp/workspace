package 일곱_메소드;

public class Test1_14_16 {
    public static void main(String[] args) {
        System.out.println("-----14");
        test14(45);
        System.out.println("-----15");
        test15(45, 43);
        System.out.println("-----16");
        test16(3);
    }

//    삼항연산자
    int a = 10 > 5 ? 1 : 2;
    // 10이 5보다 클 경우 1이 a에 저장되고, 아닌 경우 2가 저장됨
    public static void test14(int a) {
        if (a % 2 == 0) {
            System.out.println("짝수입니다");
        } else {
            System.out.println("홀수입니다");
        }
    }

    public static void test15(int a, int b) {
        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("두 수는 짝수입니다");
        } else if (a % 2 == 0 || b % 2 == 0) {
            System.out.println("한 수만 짝수입니다");
        } else {
            System.out.println("두 수는 홀수입니다");
        }
    }

    public static void test16(int a) {
        for (int i = 0; i <= a; i++) {
            System.out.print(i + " ");
        }
    }
}
