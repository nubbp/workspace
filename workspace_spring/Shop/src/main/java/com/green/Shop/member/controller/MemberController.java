package com.green.Shop.member.controller;

import com.green.Shop.member.service.MemberService;
import com.green.Shop.member.vo.MemberVO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/member")
public class MemberController {

    @Resource(name = "memberService")
    private MemberService memberService;

//    가입하기
    @PostMapping("/join")
    public void join(@RequestBody  MemberVO memberVO) {
        memberService.join(memberVO);
    }

//    로그인
    @PostMapping("/login")
    public MemberVO login(@RequestBody MemberVO memberVO) {
        return memberService.login(memberVO);
    }

}
