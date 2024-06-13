package Interface.array;

public class ArrayTest {
    public static void main(String[] args) {
        MyArray arr = new MyArray();
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] c = {1, 3, 4};
        int[] d = {2, 4};

        System.out.println(arr.getTwoArrayAvg(a, b));
        System.out.println(arr.isEvenArray(c));
        System.out.println(arr.isEvenArray(d));

    }
}
