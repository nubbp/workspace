package collection.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("수 입력 (" + (i+1) + "/5): ");
            list.add(sc.nextInt());
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        int sum = 0;
        for (int e : list) {
            sum = sum + e;
        }
        System.out.println();
        System.out.println(sum);
    }
}
