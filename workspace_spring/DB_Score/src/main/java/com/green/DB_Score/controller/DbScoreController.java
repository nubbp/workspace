package com.green.DB_Score.controller;

import com.green.DB_Score.service.DbScoreImpl;
import com.green.DB_Score.vo.DbScoreVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DbScoreController {
    @Resource(name = "DbScoreService")
    private DbScoreImpl dbScore;

//    리스트 뽑아오기
    @GetMapping("/")
    public String stuList(Model model) {
//      학생 목록 데이터를 db에서 조회
        List<DbScoreVO> stuList = dbScore.getStuList();
        model.addAttribute("stuList", stuList);
        return "stu_list";
    }

//    등록 페이지로 이동
    @GetMapping("/regForm")
    public String regForm() {
        return "reg_student";
    }

//    등록 후 리스트 페이지로 이동
    @PostMapping("/regStu")
    public String regStu(DbScoreVO dbScoreVO) {
        dbScore.regStu(dbScoreVO);
        return "redirect:/";
    }

//    상세 페이지 가져오기
    @GetMapping("/stuDetail")
//    public String stuDetail(StudentVO studentVO) {
//      dbScore.getStuDetail(studentVO.getStuNum());
//}
    public String stuDetail(@RequestParam(name="stuNum") int stuNum, Model model) {
        DbScoreVO student = dbScore.getStuDetail(stuNum);
        model.addAttribute("student", student);
        return "student_detail";
    }

//    수정 페이지 불러오기
    @GetMapping("/modifyStu")
    public String modifyStu(@RequestParam(name="stuNum") int stuNum, Model model) {
        DbScoreVO student = dbScore.getStuDetail(stuNum);
        model.addAttribute("student", student);
        return "update_student";
    }

//    수정 정보 저장 후 상세 페이지 리콜
    @PostMapping("/updateStu")
    public String updateStu(DbScoreVO dbScoreVO) {
        dbScore.updateStu(dbScoreVO);
        return "redirect:/stuDetail?stuNum=" + dbScoreVO.getStuNum();
    }

//    학생 삭제 후 리스트 페이지로 이동
    @GetMapping("/deleteStu")
    public String deleteStu(@RequestParam(name="stuNum") int stuNum) {
        dbScore.deleteStu(stuNum);
        return "redirect:/";
    }
}
