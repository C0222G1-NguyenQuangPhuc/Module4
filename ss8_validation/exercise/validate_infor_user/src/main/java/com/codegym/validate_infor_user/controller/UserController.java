package com.codegym.validate_infor_user.controller;

import com.codegym.validate_infor_user.model.User;
import com.codegym.validate_infor_user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("users")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("user", new User());
        return "/create";
    }

    @PostMapping("/save")
    public String save(@Valid User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "/create";
        } else {
            iUserService.save(user);
            model.addAttribute("message", "Add new successful");
            return "create";
        }
    }
}
