package com.green.ReactStudent.controller;

import com.green.ReactStudent.VO.StuVO;
import com.green.ReactStudent.service.StudentService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class stuController {
    @Resource(name = "studentService")
    private StudentService studentService;

    @GetMapping("/list")
    public List<StuVO> getStudentList() {
        System.out.println(1111);
        return studentService.getStuList();
    }

    @GetMapping("/studentDetail/{stuNum}")
    public StuVO getStudentDetail(@PathVariable("stuNum") int stuNum) {
        return studentService.getStudentDetail(stuNum);
    }

    @PostMapping("/regStudent")
    public void regStudent(@RequestBody StuVO stuVO) {
        System.out.println(stuVO);
        studentService.regStudent(stuVO);
    }

    @GetMapping("/getDelList")
    public List<StuVO> getDelList() {
        return studentService.getDelList();
    }

    @DeleteMapping("/deleteStudent/{stuNum}")
    public void deleteStudent(@PathVariable("stuNum") int stuNum) {
        studentService.deleteStudent(stuNum);
    }

    @GetMapping("/getScore/{stuNum}")
    public StuVO getScore(@PathVariable("stuNum") int stuNum) {
        return studentService.getStudentDetail(stuNum);
    }

    @PostMapping("/regScore")
    public void regScore(@RequestBody StuVO stuVO) {
        System.out.println(stuVO);
        studentService.updateScroe(stuVO);
    }

}
