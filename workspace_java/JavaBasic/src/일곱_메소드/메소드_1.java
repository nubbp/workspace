package 일곱_메소드;

// 메소드(method) == 함수(function)
// 메소드는 반복해서 실행하는 코드를 미리 하나의 기능으로 정의, 기능상자
// 메소드의 사용은 크게 메소드의 정의 부분과 메소드 호출 부분으로 나뉨
// 메소드를 사용하려면 반드시 메소드 정의 후 호출을 해야 함

// 메소드의 정의는 클래스 안 + 다른 메소드 밖에서 선언
// 메서드는 필요한 만큼 무한정 정의할 수 있음
// 메서드 명은 중복 불가(대소문자 구분)
// 메소드명은 항상 소문자로 작명한다

// 메소드의 호출은 메소드의 정의 안에서 호출
// 메소드를 호출할 떄는 정의한 메소드 명을 반드시 일치시켜야 함
// 메소드를 호출할 때는 정의한 메소드의 매개변수 정보를 일치시켜야 함
// 매개변수 정보 : 매개변수의 자료형, 매개변수의 갯수
// 매개변수(parameter) : 매소드 정의 부분 소괄호 안에서 정의된 변수
// 매개변수의 역할 : 메소드의 기능을 구현할 때 필요한 데이터를 외부에서 받아오는 것.

// 리턴타입 : 메소드의 실행 결과 값을 외부로 전달할 때 사용
// 리턴타입은 메소드의 실행 결과 외부로 전달될 데이터 타입과 일치해야 함
// 실행결과 리턴할 데이터가 없을 때는 리턴타입에 void 사용
// 메소드의 실행결과 리턴 데이터가 있다면 메소드 내부에서 'return' 키워드 사용
// 'return' 키워드는 항상 메소드의 마지막에 딱 한번만 실행 가능
// 메소드 내부에 'return'

// 메소드의 정의 문법
/*
    접근제한자 리턴타입 메서드명(매개변수 정보) {

    }

    public static void 메소드명() {

    }
*/

public class 메소드_1 {
    public static void hello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        hello();
    }

}
