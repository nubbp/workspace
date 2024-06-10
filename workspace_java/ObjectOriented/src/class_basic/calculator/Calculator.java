package class_basic.calculator;

public class Calculator {
    private int num1;
    private int num2;

    public void setNumber(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int plus(int num1, int num2) {
        return num1 + num2;
    }
    public int minus(int num1, int num2) {
        return num1 - num2;
    }
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    public int divide(int num1, int num2) {
        return num1 / num2;
    }

}
