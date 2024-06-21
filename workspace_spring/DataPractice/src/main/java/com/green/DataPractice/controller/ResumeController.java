package com.green.DataPractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ResumeController {

    @GetMapping("/resume1")
    public String resumeJoin() {
        return "resumeJoin";
    }

    @PostMapping("/resume2")
    public String resumeInfo() {
        return "resumeInfo";
    }

    @PostMapping("/resume3")
    public String resumeConfirm() {
        return "resumeConfirm";
    }
}
