package class_basic.car;

//접근제한자 : 클래스 혹은 메소드, 멤버변수에서 사용
// 1. public : 프로젝트 내에 존재하면 접근 가능
// 2. default : 같은 패키지 내에 있으면 접근 가능
// 3. protected :
// 4. private : 변수, 메소드가 선언된 클래스 안에서만 접근 가능

//멤버 변수에는 무조건 private
// 메소드는 무조건 public

public class Phone {
    int price;
    public String modelName;
    String brand;

//    생성자
    public Phone() {
        this.price = 0;
        this.modelName = "";
    }

    public void setPrice(int price) {
        if(price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }
}
