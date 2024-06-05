package 일곱_메소드;

public class Test1_17_19 {
    public static void main(String[] args) {
        System.out.println("-----17");
        test17(2, 6);
        System.out.println();
        System.out.println("-----18");
        test18(2, 12);
        System.out.println("-----19");
        test19("AAA ", 3);
    }

    public static void test17(int a, int b) {
        int max = a >= b ? a : b;
        int min = a < b ? a : b;
        /*if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }*/

        for (int i = min + 1; i < max; i++) {
            System.out.print(i + " ");
        }
    }

    public static void test18(int a, int b) {
        int max = a >= b ? a : b;
        int min = a < b ? a : b;

        int cnt = 0;
        for (int i = min; i < max; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
                cnt++;
            }
        }
        System.out.println();
        System.out.println(cnt + "개");
    }

    public static void test19(String a, int b) {
        String result = "";

        for (int i = 0; i < b; i++){
            result += a;
        }

        System.out.println(result);
        /*for (int i = 0;  i < b; i++) {
            System.out.print(a + " ");
        }*/
    }
}
