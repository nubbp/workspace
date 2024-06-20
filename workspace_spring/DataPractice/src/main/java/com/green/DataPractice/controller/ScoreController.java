package com.green.DataPractice.controller;

import com.green.DataPractice.vo.ScoreVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ScoreController {

    @GetMapping("/page_1")
    public String page1() {
        return "page1";
    }

    @PostMapping("/page_2")
    public String page2(ScoreVo scoreVo) {
        System.out.println(scoreVo);
        return "page2";
    }
    @PostMapping("/page_3")
    public String page3(ScoreVo scoreVo) {
        System.out.println(scoreVo);
        return "page3";
    }

    @PostMapping("/page_4")
    public String page4(ScoreVo scoreVo, Model model) {
        System.out.println(scoreVo);

        double avg = (scoreVo.getKorScore() + scoreVo.getMathScore() + scoreVo.getEngScore()) / 3.0;
        model.addAttribute("avg", avg);
        return "page4";
    }

    @GetMapping("/a")
    public String inputName() {
        return "input_name";
    }
    @PostMapping("/b")
    public String inputAge(@RequestParam(name = "name") String name, Model model) {
        System.out.println(name);
        model.addAttribute("name", name);
        return "input_age";
    }
    @PostMapping("/c")
    public String show(@RequestParam(name = "name") String name, @RequestParam(name = "age") int age, Model model) {
        return "show";
    }
}
