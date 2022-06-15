package com.codegym.controller;

import com.codegym.service.IConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class ConvertController {

    @Autowired
    IConvertService iConvertService;

    @GetMapping
    public String home(){
        return "index";
    }

    @PostMapping("/convert")
    public String convert(@RequestParam double money, Model model){
        Double converted = iConvertService.convert(money);
        model.addAttribute("converted",converted);
        model.addAttribute("money",money);
        return "index";
    }
}
