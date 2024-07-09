package java2;

public class CalTest {
    public static void main(String[] args) {
        Calculate cal = new Calculate();
        cal.setNumber(1, 5);
        System.out.println("객체가 가진 두 정수의 합: " + cal.getSum());
        System.out.println("객체가 가진 두 정수 중 큰 수: " + cal.getMax());
        System.out.println("객체가 가진 두 정수 사이의 정수들의 평균 리턴: " + cal.getAvg());

        System.out.println("-------------");

        cal.setNumber(7, 2);
        System.out.println("객체가 가진 두 정수의 합: " + cal.getSum());
        System.out.println("객체가 가진 두 정수 중 큰 수: " + cal.getMax());
        System.out.println("객체가 가진 두 정수 사이의 정수들의 평균 리턴: " + cal.getAvg());
    }
}
