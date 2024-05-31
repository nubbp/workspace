package IF_문제_1;

public class Test5 {
    public static void main(String[] args) {
        int num = 55;

        if (num > 90 &&  num <= 100 ) {
            System.out.println("학점은 A입니다.");
        } else if (num > 80 /* && num <= 90 */) {
            System.out.println("학점은 B입니다.");
        } else {
            System.out.println("학점은 C입니다.");
        }
    }
}
