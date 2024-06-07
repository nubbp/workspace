package 일곱_메소드;

public class Test3_5 {
    public static void main(String[] args) {
        int[] arr = {1,3,5};
        m5(arr);
    }

    public static void m5(int[] a) {
        /*for(int arr : a) {
            System.out.print(arr + " ");
        }*/
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
