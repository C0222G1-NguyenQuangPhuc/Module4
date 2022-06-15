package com.codegym.controller;

import com.codegym.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class CalculatorController {

    @Autowired
    ICalculatorService iCalculatorService;

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @PostMapping("/calculator")
    public String calculation(@RequestParam  Map<String, String> operand, Model model){
        String result = iCalculatorService.calculated(operand);
        model.addAttribute("result", result);
        model.addAttribute("num1",operand.get("num1"));
        model.addAttribute("num2",operand.get("num2"));
        return "index";
    }
}
