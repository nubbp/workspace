package com.green.DB_Score.controller;

import com.green.DB_Score.service.DbScoreImpl;
import com.green.DB_Score.vo.DbScoreVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DbScoreController {
    @Resource(name = "DbScoreService")
    private DbScoreImpl dbScore;

    @GetMapping("/")
    public String stuList(Model model) {
//      학생 목록 데이터를 db에서 조회
        List<DbScoreVO> stuList = dbScore.getStuList();
        model.addAttribute("stuList", stuList);
        return "stu_list";
    }

    @GetMapping("/regForm")
    public String regForm() {
        return "reg_student";
    }

    @PostMapping("/regStu")
    public String regStu() {
        DbScoreVO vo = new DbScoreVO();
        vo.setStuNum();
        vo.setStuName();
        vo.setKorScore();
        vo.setEngScore();
        vo.setIntro();
        dbScore.regStu(vo);
        return "rediret:/";
    }
}
