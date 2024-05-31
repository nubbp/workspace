package 세번째_연산자;

public class 연산자_3 {
    public static void main(String[] args) {
        int a = 5;
        ++a; // a이 값을 1 증가
        System.out.println(a);
        a++; // a의 값을 1 증가
        System.out.println(a);
        --a; // a의 값을 1 감소
        System.out.println(a);
        a--; // a의 값을 1 감소

//         증감연산자를 단독으로 사용하는지
//         다른 코드와 함께 사용하는지에 따라서 결과 달라짐
//         다른 코드와 함께 쓰는 경우
//         ++a : 먼저 1 증가 후 다른 코드를 실행

        int b = 5;
        System.out.println(++b);
        int c = 5;
        System.out.println(c++);
        System.out.println(c);

        int num1 = 10;
        int result = 10 + num1++;
        System.out.println(result);
        System.out.println(num1);

    }
}
