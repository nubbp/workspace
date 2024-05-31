package 변수와자료형;// 자료형이 다르면 데이터 저장 불가

// 자바는 크게 기본 자료형과 참조자료형으로 데이터의 형태를 구분
// 자바에서 기본 자료형은 총 8개
// 참조 자료형은 무한대

// 기본 자료형
// 정수 타입: byte short int* long
// 실수 타입: float double*
// 논리 타입: boolean
// 문자 타입: char
// ------------------------------------
// 문자열 타입 : String ********기본 자료형 아님, 참조 자료형*********
public class 자료형_1 {
    public static void main(String[] args) {
    byte n1 = 100;
//    byte n2 = 1000; byte 범위 초과로 오류 뜸

        int n2 = 100;
//        int n4 = 10.5; 정수형 자료형이기 때문에 실수 넣으면 오류남
        double n3 = 10.5;

//        쌍따옴표 없음
        boolean b1 = true;
        boolean b2 = false;

//        문자열(0개 글자 이상 + 쌍따옴표로 감쌈)
        String s1 = "java";
        String s2 = "false";
//        String s3 = fasle;  boolean 자료형이라 문자열 자료형에 들어갈 수 없음
//        String s4 = 'j';    홑따옴표 안 됨

//        문자 (한 글자 + 홑따옴표로 감쌈)
//        char c1 = "java"; //하나만 저장됨
        char c2 = 'j';
        System.out.println("c2 = " + c2);
        char c3 = 65; // 65의 코드 -> A로 변환되어 나옴
        System.out.println("c3 = " + c3);
        char c4 = 'V';
        System.out.println("c4 = " + c4);
        int c5 = c3;
        System.out.print("c5 = " + c5);

        String aaa = "A";

    }
}
