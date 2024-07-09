package Java_2.src.test;

public class Calculate {
    private int num1;
    private int num2;

//    클래스가 가진 두 정수 데이터를 매개변수로 전달된 값으로 변경하는 기능
    void setNumber(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    int getSum() {
        return num1 + num2;
    }

    int getMax() {
        return num1 > num2 ? num1 : num2;
    }

    double getAvg() {
        int max = num1 > num2 ? num1 : num2;
        int min = num1 < num2 ? num1 : num2;
        int total = 0;
        int cnt = 0;

        System.out.print("객체가 가진 두 정수 사이의 정수(확인용): ");
        for (int i = min + 1; i < max; i++) {
            System.out.print(i + " ");
            total += i;
            cnt++;
        }
        System.out.println();
        return (double)total / cnt;
    }

}
