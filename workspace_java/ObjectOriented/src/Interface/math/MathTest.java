package Interface.math;

public class MathTest {
    public static void main(String[] args) {
        MyMath math = new MyMath();

        System.out.println(math.getMin(4, 9));
        System.out.println(math.getCircleArea(2));
        System.out.println(math.getMultiple(2, 3));
    }
}
