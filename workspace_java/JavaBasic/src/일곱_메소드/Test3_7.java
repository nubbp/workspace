package 일곱_메소드;

public class Test3_7 {
    public static void main(String[] args) {
        String[] arr = {"가", "나", "다"};
        System.out.println(m7(arr));
    }

    public static String m7(String[] a){
        String total = "";
        for (int i = 0; i < a.length; i++) {
            total += (a[i] + " ");
        }
        return total;
    }
}
