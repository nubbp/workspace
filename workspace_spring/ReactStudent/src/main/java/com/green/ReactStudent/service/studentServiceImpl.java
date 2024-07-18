package com.green.ReactStudent.service;

import com.green.ReactStudent.VO.StuVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class studentServiceImpl implements StudentService {
    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public List<StuVO> getStuList() {
        return sqlSession.selectList("stuMapper.stuList");
    }

    @Override
    public StuVO getStudentDetail(int stuNum) {
        return sqlSession.selectOne("stuMapper.studentDetail", stuNum);
    }

    @Override
    public void regStudent(StuVO stuVO) {
        sqlSession.insert("stuMapper.regStudent", stuVO);
    }

    @Override
    public List<StuVO> getDelList() {
        return sqlSession.selectList("stuMapper.stuList");
    }

    @Override
    public void deleteStudent(int stuNum) {
        sqlSession.delete("stuMapper.deleteStudent", stuNum);
    }

    @Override
    public void updateScroe(StuVO stuVO) { sqlSession.update("stuMapper.regScore", stuVO); }
}
