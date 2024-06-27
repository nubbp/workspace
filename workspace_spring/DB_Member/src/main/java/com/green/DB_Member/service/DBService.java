package com.green.DB_Member.service;

import com.green.DB_Member.VO.MemberVO;

import java.util.List;

// 인터페이스에는 작성한 쿼리를 실행할 메소드를 정의
// 메소드의 매개변수 : 실행할 쿼리에 빈값을 채워주는 데이터
// 메소드의 리턴타입: 쿼리 실행결과 데이터베이스에서 가져오는 데이터 타입
public interface DBService {

    String select1();

    int select2(int memNum);

    List<String> select3(int memAge);

    MemberVO select4(int memNum);

    List<MemberVO> select5();

    int delete(int memNum);

    void insert(MemberVO memberVO);

    int update(MemberVO memberVO);
}
