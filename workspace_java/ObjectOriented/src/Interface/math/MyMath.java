package Interface.math;

public class MyMath implements MathUtil {

    //    매개변수로 받은 두 수 중 작은 수를 리턴
    public int getMin(int a, int b){
        /*int min = 0;
        if (a > b) {
            min = b;
        } else {
            min = a;
        }
        return min;*/
        return a < b ? a : b;
    }

    //    매개변수로 받은 반지름을 가진 원의 둘레 리턴
//    단, 매개변수로 들어온 반지름이 음수라면 둘레는 0이 되어야 함
    public double getCircleArea(int radius) {
        /*if (radius < 0) {
            return 0;
        } else {
            return radius * 2 * Math.PI;
        }*/
        return radius < 0 ? 0 : radius * 2 * Math.PI;
    }

    //    첫번째 매개변수로 받은 수의 n제곱 값을 리턴
    public int getMultiple(int num1, int num2) {
        int result = 1;
        for (int i = 0; i < num2; i++) {
            result *= num1;
        }
        return result;
    }
}
