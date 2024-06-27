package com.green.DB_Member.controller;

import com.green.DB_Member.VO.MemberVO;
import com.green.DB_Member.service.DBServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DBController {
    @Resource(name = "dbService")
    private DBServiceImpl dbService;

//    회원번호가 1번인 회원의 이름을 조회
    @GetMapping("/select1")
    public String select1() {
        String name = dbService.select1();
        System.out.println("조회한 이름 : " + name);
        return "db_result";
    }

//    전달된 회원번호를 지닌 회원의 나이를 조회
    @GetMapping("/select2")
    public String select2() {
        int num = 5;
        int age = dbService.select2(num);
        System.out.println("회원번호가 " + num + "인 회원의 나이 : " + age);
        return "db_result";
    }

//    나이가 전달된 정수 이상인 회원의 이름을 조회
    @GetMapping("/select3")
    public String select3() {
        int age = 35;
        List<String> nameList = dbService.select3(age);
        System.out.print("나이가 " + age + " 이상인 회원의 이름 조회: [ ");
        for (String s : nameList) {
            System.out.print(s+ " ");
        }
        System.out.println("]");
        return "db_result";
    }

//    전달받은 회원번호를 지닌 회원의 회원정보
    @GetMapping("/select4")
    public String select4() {
        int num = 1;
        MemberVO member = dbService.select4(num);
        System.out.println("회원번호 " + num + "번의 모든 회원 정보: " + member);
        return "db_result";
    }

//    모든 회원의 회원번호, 이름, 나이, 주소를 조회
    @GetMapping("/select5")
    public String select5() {
        List<MemberVO> memberList = dbService.select5();
        for (MemberVO member : memberList) {
            System.out.println(member);
        }
        return "db_result";
    }

//    delete, update, insert 리턴 타입: void, int
//    전달받은 회원번호를 가진 회원을 삭제
    @GetMapping("/delete")
    public String delete() {
        int result = dbService.delete(102);
        System.out.println("삭제한 행 개수: " + result);
        return "db_result";
    }

//    회원 한 명 추가
    @GetMapping("/insert")
    public String insert(){
        MemberVO vo = new MemberVO();
        vo.setMemNum(111);
        vo.setMemName("박대기");
        vo.setMemAge(50);
        vo.setMemAddr("서울시");
        dbService.insert(vo);
        return "db_result";
    }

//    전달받은 회원번호를 지닌 회원의 이름, 나이, 주소를 변경
    @GetMapping("/update")
    public String update() {
        MemberVO vo = new MemberVO();
        vo.setMemNum(2);
        vo.setMemName("개명");
        vo.setMemAge(99);
        vo.setMemAddr("이사감");
        int result = dbService.update(vo);
        System.out.println("업데이트 된 행 개수 :" + result);
        return "db_result";
    }
}
