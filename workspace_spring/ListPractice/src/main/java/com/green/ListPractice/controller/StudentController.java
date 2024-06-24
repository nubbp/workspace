package com.green.ListPractice.controller;

import com.green.ListPractice.service.StudentService;
import com.green.ListPractice.vo.StudentVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    StudentService studentService = new StudentService();

//    학생 목록 페이지
    @GetMapping("/stu_list")
    public String stuList(Model model) {

//        학생 목록 데이터 받아오기
        List<StudentVO> list = studentService.getStuList();

//        학생 목록을 html로 전달
        model.addAttribute("stuList", list);

        return "stu_list";
    }

//    학생 등록 페이지
    @GetMapping("/reg_student")
    public String regStu() {
        return "reg_student";
    }

//    학생 등록 + 리스트 페이지
    @PostMapping("/stu_list")
    public String regEnd(StudentVO studentVO) {
        System.out.println(studentVO);
        studentService.regStudent(studentVO);
        return "redirect:/stu_list";
    }

//    학생 상세 조회
    @GetMapping("/student_detail")
    public String student_detail(@RequestParam(name = "num") int stuNum, Model model) {
//        내가 클릭한 학생 한 명을 검색(학번)
        StudentVO student = studentService.getStuDetail(stuNum);
//        학생 상세 정보 데이터를 html 로 전달
        model.addAttribute("student", student);
        return "student_detail";
    }

//    학생 삭제 + 목록 페이지로 이동
    @GetMapping("/stu_delete")
    public String stuDelete(@RequestParam(name="num") int num) {
        studentService.deleteStu(num);
        return "redirect:/stu_list";
    }

//    학생 정보 수정 폼으로 이동
    @GetMapping("/update_student")
    public String updateForm(@RequestParam(name="num") int num, Model model) {
//        정보를 수정할 학생의 원래 정보를 html로 전달
//        1. 정보를 수정할 학생 한 명을 선택
        StudentVO student = studentService.getStuDetail(num);
//        2. 수정할 학생을 html로 전달
        model.addAttribute("student", student);
        return "update_student";
    }

//     학생 정보 수정 적용
    @PostMapping("/updateStu")
    public String updateStu(StudentVO studentVO) {

//        학생 정보 수정
        studentService.updateStu(studentVO);

        return "redirect:/student_detail?num="+ studentVO.getNum();
    }
}
