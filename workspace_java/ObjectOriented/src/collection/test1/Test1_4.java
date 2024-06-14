package collection.test1;

import java.util.ArrayList;
import java.util.List;

public class Test1_4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int count = 0;



        for (int i = 0; i < 10; i++) {
            int randomInt = (int)(Math.random() * 100) + 1;
            list.add(randomInt);
        }

        for (int e : list) {
            if (e % 2 == 0) {
                count++;
                System.out.print(e + " ");
            }
        }
        System.out.println(count + "개");
    }
}
