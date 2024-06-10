package class_basic.man;

public class Man {
//    이름, 나이, 주소
    private String name;
    private int age;
    private String addr;

//    모든 값을 변경할 수 있는 생성자
    public Man(String name, int age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

//    setter : 멤버변수 각각의 값을 변경하는 메소드
//    setter의 이름은 set변수명으로 반드시 지정
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }

//    getter : 멤버변수 각각의 값을 return 받는 메소드
//    getter의 이름은 get변수명으로 반드시 지정
    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAddr() {
        return addr;
    }

    public void printMan() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + addr);
    }

}
