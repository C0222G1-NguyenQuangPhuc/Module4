package com.codegym.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping
    public String test(){
        return "index";
    }

    @PostMapping("/convert")
    public String convert(@RequestParam double money, Model model){
        Double convertMoney = money * 23000;
        model.addAttribute("convertMoney",convertMoney);
        model.addAttribute("money",money);
        return "index";
    }
}
