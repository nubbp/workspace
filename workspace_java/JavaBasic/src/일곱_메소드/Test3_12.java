package 일곱_메소드;

public class Test3_12 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        m12(arr);
    }

    public static void m12(int[] a) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[a.length - (i + 1)];
            System.out.println(result[i]);
        }
    }
}
