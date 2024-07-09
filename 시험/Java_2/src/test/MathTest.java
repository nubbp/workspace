package Java_2.src.test;

public class MathTest {
    public static void main(String[] args) {
        MathUtilImpl math = new MathUtilImpl();

        System.out.println(math.isEven(1, 2, 7));
        System.out.println(math.isEven(1, 2, 3));

        System.out.println(math.getSumFromOne(3));

        int[] arr = {1,2,3};
        System.out.println(math.getArraySum(arr));
    }
}
