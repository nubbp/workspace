package 일곱_메소드;

// 매개변수(parameter) : 메소드 정의 부분 소괄호 안에서 정의된 변수

public class 메소드_3 {
    public static void main(String[] args) {
        tellYourName("홍길동");
        tellYourName(" ");
//    tellYourName(5); 매개변수의 자료형 일치 필요
    }

    public static void tellYourName(String name) {     //String name = "홍길동";
        System.out.println("제 이름은 " + name + "입니다.");
    }
}
