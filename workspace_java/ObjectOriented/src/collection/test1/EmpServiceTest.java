package collection.test1;

import java.util.ArrayList;
import java.util.List;

public class EmpServiceTest {
    public static void main(String[] args) {
        List<Emp> list = new ArrayList<>();
        EmpService esv = new EmpService();
        Emp e1 = new Emp(1001, "김길동", "개발부", 1234, 2000);
        Emp e2 = new Emp(1002, "홍길동", "개발부", 1235, 3000);
        Emp e3 = new Emp(1003, "이길동", "개발부", 1236, 4000);
        Emp e4 = new Emp(1004, "박길동", "홍보부", 1237, 5000);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        esv.logIn(list);
        System.out.println("--------------");
        esv.printSalary(list);
        System.out.println("--------------");
        esv.salaryUp(list);


    }
}
