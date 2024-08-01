package com.green.Shop.member.service;

import com.green.Shop.member.vo.MemberVO;

public interface MemberService {

    void join(MemberVO memberVO);
    MemberVO login(MemberVO memberVO);
}
