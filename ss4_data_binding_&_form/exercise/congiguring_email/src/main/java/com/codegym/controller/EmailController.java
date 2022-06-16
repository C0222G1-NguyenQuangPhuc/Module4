package com.codegym.controller;

import com.codegym.model.Email;
import com.codegym.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmailController {

    @Autowired
    private IEmailService iEmailService;

    @GetMapping
    public String home(Model model) {
        model.addAttribute("email",new Email());
        model.addAttribute("listLanguage", iEmailService.listLanguage());
        model.addAttribute("listSize", iEmailService.listSize());
        return "index";
    }

    @PostMapping("/update")
    public String updateEmail(@ModelAttribute("email") Email email, Model model) {
        model.addAttribute("email", email);
        return "info";
    }
}
