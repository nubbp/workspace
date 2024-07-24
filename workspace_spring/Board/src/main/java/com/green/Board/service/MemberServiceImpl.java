package com.green.Board.service;

import com.green.Board.vo.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service("memberService")
public class MemberServiceImpl implements MemberService {

    @Autowired
    private SqlSessionTemplate sqlSession;


//    가입하기
    @Override
    public void join(MemberVO memberVO) {
        log.info("========join()메소드 실행==========");
        log.info("========memberVO에 전달된 데이터==========");
        log.info(memberVO.toString());
        log.info("========데이터 확인 끝==========");
        sqlSession.insert("memberMapper.join", memberVO);
    }

//    ID 중복 확인
//    아이디 중복 시 true, 중복 아니면 false
    @Override
    public boolean idDuplicate(String memID) {
//        id가 null이면 회원가입 가능
//        id가 조회되면 (null 아니면) 회원가입 불가능
        String id = sqlSession.selectOne("memberMapper.idDuplicate", memID);
        return id != null;
    }

    @Override
    public MemberVO login(MemberVO memberVO) {
        return sqlSession.selectOne("memberMapper.login", memberVO);
    }
}
