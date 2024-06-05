package 여섯째_배열;

public class 배열과기본자료형의차이 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        a = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println();

        int[] c = {1,3,5};
        int[] d = c;
        c[0] = 10;
        d[2] = 0;

        for (int i : c) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : d) {
            System.out.print(i + " ");
        }


//        배열의 복사
        int[] e = {1,2,3};
        int[] f = e.clone();
    }
}
