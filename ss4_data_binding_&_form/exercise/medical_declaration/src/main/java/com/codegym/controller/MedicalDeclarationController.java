package com.codegym.controller;

import com.codegym.model.MedicalDeclaration;
import com.codegym.service.IMedicalDeclarationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MedicalDeclarationController {

    @Autowired
    private IMedicalDeclarationService iMedicalDeclarationService;

    @GetMapping
    private String home(Model model){
        model.addAttribute("medical", new MedicalDeclaration());
        model.addAttribute("listBirth",iMedicalDeclarationService.getBirthList());
        model.addAttribute("listNationality",iMedicalDeclarationService.getNationalityList());
        model.addAttribute("listGender",iMedicalDeclarationService.getGenderList());
        model.addAttribute("listVehicle",iMedicalDeclarationService.getVehicleList());
        model.addAttribute("listDay",iMedicalDeclarationService.getDayList());
        model.addAttribute("listMonth",iMedicalDeclarationService.getMonthList());
        model.addAttribute("listYear",iMedicalDeclarationService.getYearList());
        return "home";
    }

    @PostMapping("/create")
    public String resultMedical(@ModelAttribute MedicalDeclaration medicalDeclaration, Model model){
        model.addAttribute("medical", medicalDeclaration);
        return "info";
    }
}
