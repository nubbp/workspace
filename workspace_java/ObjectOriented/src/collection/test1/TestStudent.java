package collection.test1;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student st1 = new Student("김", 90, 90);
        Student st2 = new Student("이", 80, 80);
        Student st3 = new Student("박", 75, 58);

        list.add(st1);
        list.add(st2);
        list.add(st3);

        System.out.println("1)");
        for (Student e : list) {
            System.out.println(e);
        }

        System.out.println();
        System.out.println("2)");

        for (Student e : list) {
            if (e.getTotalScore() >= 150) {
                System.out.println(e);
            }
        }

        System.out.println();
        System.out.println("3)");

        int total = 0;
        for (Student e : list) {
            total += e.getTotalScore();
        }
        System.out.println((double)total/(list.size() * 2));

        System.out.println();
        System.out.println("4)");

        Student maxStu = new Student("", 0, 0);
        for (Student e : list) {
            maxStu = maxStu.getTotalScore() < e.getTotalScore() ? e : maxStu;
        }
        System.out.println(maxStu);
    }
}
