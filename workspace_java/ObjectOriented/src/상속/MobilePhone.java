package 상속;

public class MobilePhone {
    String number;
    public void sendMsg(){
        System.out.println("메세지 전송");
    }
}

class SmartPhone extends  MobilePhone{
    String os;

    public void playApp(){
        System.out.println("앱 실행");
    }
}