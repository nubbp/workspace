package 상속;

// 자바에서 다중상속(부모 클래스를 여러 개 가짐)이 가능한가?
// --> 문법적으로는 불가, 논리적으로는 가능
public class Grand {
    int a;
}

class Parent1 extends Grand {
    int b;
}

class Child1 extends Parent1 {
    int c;

    public void aaa() {
        System.out.println(a);
        System.out.println(b);
    }
}