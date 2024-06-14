package collection.test1;

import java.util.ArrayList;
import java.util.List;

public class TestMember {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();

        Member m1 = new Member("id1", "pw1", "김", 10);
        Member m2 = new Member("id2", "pw2", "이", 11);
        Member m3 = new Member("id3", "pw3", "박", 12);

        list.add(m1);
        list.add(m2);
        list.add(m3);

        System.out.println("6번-------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println();
        System.out.println("7번-------------------");
        int totalAge = 0;
        for (int i = 0; i < list.size(); i++) {
            totalAge += list.get(i).getAge();
        }
        System.out.println(totalAge);

//        8번
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals("id1")) {
                list.remove(i);
            }
        }
    }
}
