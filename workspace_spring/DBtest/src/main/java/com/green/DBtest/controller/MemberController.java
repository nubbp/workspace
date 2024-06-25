package com.green.DBtest.controller;

import com.green.DBtest.service.MemberService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
    @Resource(name = "memberService")
    private MemberService memberService;

//    이 메소드가 실행되면 test_member 테이블에 1개의 데이터가 insert 됨
    @GetMapping("/insert1")
    public String insert1(){
//        memberService.insertMember();
        memberService.insertMember2();
        return "insert_1";
    }

}
