package com.codegym.controller;

import com.codegym.service.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {

    @Autowired
    Dictionary dictionary;

    @GetMapping
    public String home(){
        return "home";
    }

    @PostMapping("/search")
    public String translate(@RequestParam String keyword, Model model){
        model.addAttribute("result",dictionary.translate(keyword));
        model.addAttribute("keyword",keyword);
        return "home";
    }
}
