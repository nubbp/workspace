package 일곱_메소드;

public class Test2_5 {
    public static void main(String[] args) {
        System.out.println(m5(100));
    }

    public static String m5(int a) {
        String result;
        if (a >= 90) {
            result = "A";
        } else if (a >= 70) {
            result = "B";
        } else {
            result = "C";
        }
        return result;
    }
}
