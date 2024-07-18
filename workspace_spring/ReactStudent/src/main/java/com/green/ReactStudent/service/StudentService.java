package com.green.ReactStudent.service;

import com.green.ReactStudent.VO.StuVO;

import java.util.List;

public interface StudentService {
    List<StuVO> getStuList();
    StuVO getStudentDetail(int stuNum);
    void regStudent(StuVO stuVO);
    List<StuVO> getDelList();
    void deleteStudent(int stuNum);
    void updateScroe(StuVO stuVO);
}
