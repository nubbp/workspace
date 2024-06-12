package 상속;

public class CakeTest {
    public static void main(String[] args) {
        CheeseCake c = new CheeseCake();
        c.eat(); // 자식 클래스에서 재정의한 메소드가 실생
//        CheeseCake c = new Cake();
//        Cake c = new CheeseCake();


//        c 객체로부터 부모클래스에서 선언한 eat()메소드를 호출할 수 있나?
//        c 는 케이크가 아니라 자식인 치즈케이크이므로 부모 걸 호출 불가
    }
}
