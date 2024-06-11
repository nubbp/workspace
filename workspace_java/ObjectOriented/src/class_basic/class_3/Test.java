package class_basic.class_3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        System.out.print("1번째 수: ");
        int a = sc.nextInt();
        System.out.print("2번째 수: ");
        int b = sc.nextInt();
        System.out.print("연산자: ");
        String oper = sc.next();

        switch (oper) {
            case "+":
                Add add = new Add();
                add.setValue(a, b);
                result = add.calculate();
                break;
            case "-":
                Sub sub = new Sub();
                sub.setValue(a, b);
                result = sub.calculate();
                break;
            case "*":
                Mul mul = new Mul();
                mul.setValue(a, b);
                result = mul.calculate();
                break;
            case "/":
                Div div = new Div();
                div.setValue(a, b);
                result = div.calculate();
                break;
            default:
                System.out.println("연산자 오류");
        }
        System.out.println(a + " " + oper + " " + b + " = " + result);

    }
}
