package 일곱_메소드;

public class Test2_6 {
    public static void main(String[] args) {
        System.out.println(m6(5));
    }

    public static String m6(int a) {

//        정수 -> 문자열
        String ss = String.valueOf(333); // "333"

//        문자열 -> 정수
        int aa = Integer.parseInt("333"); // 333

        return a + "";
    }
}
