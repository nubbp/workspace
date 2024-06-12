package 상속;

class Animal{
    public void bark() {
        System.out.println("동물들이 웁니다");
    }
}

//@~~~~: 어노테이션(anotation)
//어노테이션은 개발자의 실수 방지를 위해 사용한다
public class Dog extends Animal {
    @Override
    public void bark() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    public void bark() {
        System.out.println("먐");
    }
}

class Cow extends Animal {
    public void bark() {
        System.out.println("음머");
    }
}
