package com.green.Board.service;

import com.green.Board.vo.MemberVO;

public interface MemberService {

//    가입하기
    void join(MemberVO memberVO);
//    ID 중복 확인
    boolean idDuplicate(String memID);
//    로그인
    MemberVO login(MemberVO memberVO);
}
