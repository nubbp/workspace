package class_basic.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();
        int result = 0;

        System.out.print("첫 번째 수 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 수 : ");
        int num2 = sc.nextInt();
        System.out.print("연산자 : ");
        String s = sc.next();

        c.setNumber(num1, num2);

        if (s.equals("+")) {
            result = c.plus(num1, num2);
        } else if (s.equals("-")) {
            result = c.minus(num1, num2);
        } else if (s.equals("*")) {
            result = c.multiply(num1, num2);
        } else if (s.equals("/")) {
            result = c.divide(num1, num2);
        }

        System.out.println(num1 + " " + s + " " + num2 + " = " + result);
    }
}
