package 변수와자료형;

public class 기본자료형의_형변환 {
    public static void main(String[] args) {
//        정수는 실수에 저장 가능
//        자동 형변환(aka: promotion)
        int num1 = 5;
        double num2 = num1;
        System.out.println("num2 = " + num2);

//        강제 형변환 (aka: Casting)
        double num3 = 5.5;
//        int num4 = num3; 오류!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        System.out.println("실수형을 정수형으로 저장하는 건 불가능");
        int num4 = (int) num3; // 실수 데이터 num3를 int로 강제 형변환
    }
}
