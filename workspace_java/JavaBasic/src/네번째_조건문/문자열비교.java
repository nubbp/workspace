package 네번째_조건문;

import java.util.Scanner;

public class 문자열비교 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        /*int x = 5;
        int y = 10;
        System.out.println(x == y);

        String s1 = "java";
        String s2 = "python";
        System.out.println(s1 == s2);
        System.out.println("1" == "1");

        System.out.println("---kim---");
        String name = "kim";
        // name 변수의 값이 "kim"이랑 같은가?
        boolean result = name.equals("kim");
        System.out.println(result);


        String addr = "울산";
        if (addr.equals("울산")) {
            System.out.println("울산");
        }





        System.out.print("성별 입력 (남/여) : ");
        String gender = sc.next();

        if( gender.equals("남") ) {
            System.out.println("남자입니다.");
        } else if (gender.equals("여")) {
            System.out.println("여자입니다.");
        } else {
            System.out.println("다시 입력하세요.");
        }

        switch (gender) {
            case "남" :
                System.out.println("남자입니다.");
            case "여" :
                System.out.println("여자입니다.");
            default:
                System.out.println("다시 입력하세요.");
        }*/


        System.out.print("첫 번째 수 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 수 : ");
        int num2 = sc.nextInt();
        System.out.print("연산자 : ");
        String str = sc.next();

        int result1;

        System.out.print("if문 결과 : ");
        if (str.equals("+")) {
            result1 = num1 + num2;
            System.out.println(num1 + " " + str + " " + num2 + " = " + result1);
        } else if (str.equals("-")) {
            result1 = num1 - num2;
            System.out.println(num1 + " " + str + " " + num2 + " = " + result1);
        } else if (str.equals("*")) {
            result1 = num1 * num2;
            System.out.println(num1 + " " + str + " " + num2 + " = " + result1);
        } else if (str.equals("/")) {
            result1 = num1 + num2;
            System.out.println(num1 + " " + str + " " + num2 + " = " + result1);
        } else {
            System.out.println("연산자를 잘못 입력하였습니다.");
        }


        System.out.print("switch문 결과 : ");
        switch (str) {
            case "+":
                result1 = num1 + num2;
                System.out.println(num1 + " " + str + " " + num2 + " = " + result1);
                break;
            case "-":
                result1 = num1 - num2;
                System.out.println(num1 + " " + str + " " + num2 + " = " + result1);
                break;
            case "*":
                result1 = num1 * num2;
                System.out.println(num1 + " " + str + " " + num2 + " = " + result1);
                break;
            case "/":
                result1 = num1 / num2;
                System.out.println(num1 + " " + str + " " + num2 + " = " + result1);
                break;
            default:
                System.out.println("연산자를 잘못 입력하였습니다.");
        }

    }
}
