package collection.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpService {
    private Scanner sc;
    private List<Emp> empList;

    public EmpService() {
        sc = new Scanner(System.in);
        empList = new ArrayList<>();

        Emp e1 = new Emp(1001, "김길동", "개발부", "1111-1234", 2000);
        Emp e2 = new Emp(1002, "홍길동", "개발부", "1111-1235", 3000);
        Emp e3 = new Emp(1003, "이길동", "인사부", "1111-1236", 4000);
        Emp e4 = new Emp(1004, "박길동", "홍보부", "1111-1237", 5000);
        Emp e5 = new Emp(1004, "박길동", "홍보부", "1111-1238", 6000);

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
    }

    public void logIn(){
        boolean isRunning = true; //while문 반복 변수
        boolean isFind = false; //일치하는 사번 찾았니

        while (isRunning) {
            System.out.print("사번 : ");
            int logId = sc.nextInt();
            System.out.print("비밀번호(연락처의 마지막 4자리) : ");
            String logPw = sc.next();

            for (Emp e : empList) {
                if (e.getEmpId() == logId && e.getPw().equals(logPw)) {
                    isRunning = false;
                    isFind = true;
                    System.out.println("로그인 하였습니다.");
                    System.out.println("'" + e.getName() + "'님 반갑습니다.");
                }
            }
            if (!isFind) { // '!' : 부정연산자
                System.out.println("사번 혹은 비밀번호가 일치하지 않습니다.");
            }
        }


    }

    public void printSalary() {
        System.out.print("부서명 : ");
        String partName = sc.next();
        int samePartTotalSalary = 0;
        int samePartCnt = 0;

        System.out.println("==" + partName + " 월급 현황==");
        for (int i = 0; i < empList.size(); i++) {
            if (empList.get(i).getPartName().equals(partName)) {
//                System.out.println("이름 : " + empList.get(i).getName() + "  월급 : " + empList.get(i).getSalary());
                System.out.println(empList.get(i));
                samePartTotalSalary += empList.get(i).getSalary();
                samePartCnt++;
            }
        }
        System.out.println(partName + "서의 월급 총액은 " + samePartTotalSalary + "원이며, 평균 급여는 " + samePartTotalSalary/samePartCnt + "원입니다.");
    }

    public void salaryUp() {
        System.out.print("부서명 : ");
        String partName = sc.next();
        System.out.print("인상급여 : ");
        int salary = sc.nextInt();
        System.out.println(partName + " 각 사원의 급여가 각각 " + salary + "원씩 인상됩니다.");
        System.out.println("==월급 인상 후 " + partName + " 월급 현황==");

        for (Emp e : empList) {
            if (e.getPartName().equals(partName)) {
                e.setSalary(e.getSalary() + salary);
//                System.out.println("이름 : " + e.getName() + "  월급 : " + (e.getSalary() + salary));
                System.out.println(e);
            }
        }

    }
}