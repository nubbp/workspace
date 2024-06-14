package collection.test1;

import java.util.List;
import java.util.Scanner;

public class EmpService {
    Scanner sc = new Scanner(System.in);

    public void logIn(List<Emp> list){
        System.out.print("사번 : ");
        int logId = sc.nextInt();
        System.out.print("비밀번호(연락처의 마지막 4자리) : ");
        int logPw = sc.nextInt();

        for (Emp e : list) {
            if (e.getEmpId() == logId && e.getPhoneNum() == logPw) {
                System.out.println("로그인 하였습니다.");
                System.out.println("'" + e.getName() + "님 반갑습니다.");
                break;
            }
            else {
                System.out.println("사번 혹은 비밀번호가 일치하지 않습니다.");
            }
        }
    }

    public void printSalary(List<Emp> list) {
        System.out.print("부서명 : ");
        String partName = sc.next();
        int samePartTotalSalary = 0;
        int samePartCnt = 0;

        System.out.println("==개발부 월급 현황==");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPartName().equals(partName)) {
                System.out.println("이름 : " + list.get(i).getName() + "  월급 : " + list.get(i).getSalary());
                samePartTotalSalary += list.get(i).getSalary();
                samePartCnt++;
            }
        }
        System.out.println("개발부서의 월급 총액은 " + samePartTotalSalary + "원이며, 평균 급여는 " + samePartTotalSalary/samePartCnt);
    }

    public void salaryUp(List<Emp> list) {
        System.out.print("부서명 : ");
        String partName = sc.next();
        System.out.print("인상급여 : ");
        int salary = sc.nextInt();
        System.out.println("개발부 각 사원의 급여가 각각 " + salary + "원씩 인상됩니다.");
        System.out.println("==월급 인상 후 개발부 월급 현황==");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPartName().equals(partName)) {
                System.out.println("이름 : " + list.get(i).getName() + "  월급 : " + (list.get(i).getSalary() + salary));
            }
        }

    }
}