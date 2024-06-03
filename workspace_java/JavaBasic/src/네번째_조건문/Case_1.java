package 네번째_조건문;

/*
    switch case break

    switch (변수) {
       case 값1 :
       case 값2 :
       case 값3 :
       break;
    }
*/

public class Case_1 {
    public static void main(String[] args) {
        System.out.println("시작");

        int num = 33;

        switch (num) {
            case 1 :
                System.out.println(1);
                break;
            case 3 :
                System.out.println(3);
                break;
            case 5 :
                System.out.println(5);
                break;
            case 7 :
                System.out.println(7);
                break;
            default:
                System.out.println("해당 없음");
        }

        System.out.println("종료");
    }
}
