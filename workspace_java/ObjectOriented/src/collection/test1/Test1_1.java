package collection.test1;

import java.util.ArrayList;
import java.util.List;

public class Test1_1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("가");
        list.add("나");
        list.add("다");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
