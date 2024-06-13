package object;

public class String_4 {
    public static void main(String[] args) {
        String a = "짜장면";
        String b = "잠뽕";

//        concat : 두 문자열을 나열
        System.out.println(a.concat(b));

//        substring : 문자열 일부 추출
        String str1 = "12345678";
        System.out.println(str1.substring(2)); // 2번째 글자 다음부터 추출
        System.out.println(str1.substring(2, 4)); // 2번째 글자 다음부터 4번째 글자까지 추출

        String str2 = "집갈래";
        System.out.println(str2.length());

        String str3 = "피자, 치킨, 족발";
        String[] result = str3.split(",");
        System.out.println(result[0]);
    }
}
