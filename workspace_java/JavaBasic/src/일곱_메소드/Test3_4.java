package 일곱_메소드;

public class Test3_4 {
    public static void main(String[] args) {
        System.out.println(m4(6));
    }

    public static boolean m4(int a) {
        // boolean result;
        /*
        if (a % 2 == 0) {
            result = true;
        } else {
            result = false;
        }
        */

        /*
        result = (a % 2 == 0 ? true : false);
        return result;
        */

        return a % 2 == 0;
    }
}
