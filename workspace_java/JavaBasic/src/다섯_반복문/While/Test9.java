package 다섯_반복문.While;

public class Test9 {
    public static void main(String[] args) {
        int i = 1;
        int j = 0;
        while (i <= 10) {
            j = j + i;
            i++;
        }
        System.out.println(j);
    }
}
