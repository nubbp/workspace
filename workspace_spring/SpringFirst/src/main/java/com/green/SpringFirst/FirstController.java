package com.green.SpringFirst;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/a")
    public String goFirst() {
        System.out.println("first 실행");
        return "first";
    }

    @GetMapping("/b")
    public String goSecond() {
        System.out.println("second 실행");
        return "second";

    }

    @GetMapping("/c")
    public String goThird() {
        System.out.println("third 실행");
        return "third";
    }

    @GetMapping("/login")
    public String goLogin() {
        System.out.println("login 실행");
        return "login";
    }

    @GetMapping("/loginResult")
    public String loginResult() {
        System.out.println("loginResult 메소드 실행");
        return "";
    }


}
