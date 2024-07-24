package com.green.Board.controller;

import com.green.Board.service.MemberService;
import com.green.Board.vo.MemberVO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/member")
public class MemberController {

    @Resource(name = "memberService")
    private MemberService memberService;

//    아이디 중복 확인
    @GetMapping("/checkID/{inputID}")
    public boolean checkID(@PathVariable("inputID") String inputID) {
        System.out.println("java");
        log.info("====== java =======");
        return memberService.idDuplicate(inputID);
    }

//    회원가입
    @PostMapping("/join")
    public void join(@RequestBody MemberVO memberVO) {
        memberService.join(memberVO);
    }

//    로그인
    @PostMapping("/login")
    public MemberVO login(@RequestBody MemberVO memberVO) {
//        조회된 데이터가 없으면 member은 null이 된다
        MemberVO member = memberService.login(memberVO);
        return member;
    }
}
