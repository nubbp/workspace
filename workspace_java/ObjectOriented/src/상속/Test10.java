package 상속;

class A {
    public A() {
        System.out.println("생성자A");
    }
    public A (int x) {
        System.out.println("생성자A: " + x);
    }
}

class B extends A {
    public B(int x) {
//        super(); --> A() 실행
        System.out.println("생성자B: " + x);
    }
}

public class Test10 {
    public static void main(String[] args) {
        A a = new A(10);
        B b = new B(11);
    }
}
