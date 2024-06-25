package com.green.DBtest.service;

//인터페이스에는 멤버변수 x, 생성자 x -> 인터페이스는 객체 생성 불가
//오로지 추상메소드(메소드의 이름만 존재하고 몸통은 없는 메소도)만 존재
//인터페이스는 단독으로 사용불가 -> 클래스의 정의부분에서 사용을 함
public interface MemberService {
    //    TEST_MEMBER 테이블에 데이터 1개 삽입
    void insertMember();
    void insertMember2();
}
