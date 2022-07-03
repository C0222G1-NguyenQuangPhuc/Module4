package com.codegym.furama_spring.controller;

import com.codegym.furama_spring.model.employee.Employee;
import com.codegym.furama_spring.model.employee.User;
import com.codegym.furama_spring.service.employee.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private IEmployeeService iEmployeeService;

    @Autowired
    private IPositionService iPositionService;

    @Autowired
    private IEducationDegreeService iEducationDegreeService;

    @Autowired
    private IDivisionService iDivisionService;

    @Autowired
    private IUserService iUserService;

    @GetMapping("")
    public String showListEmployee(@RequestParam(name = "page", defaultValue = "0") int page, Model model) {
        Sort sort = Sort.by("employee_name").ascending();
        Page<Employee> employeeList = iEmployeeService.findAllEmployee(PageRequest.of(page, 200, sort));
        model.addAttribute("employeeList", employeeList);
        model.addAttribute("positionList", iPositionService.findAll());
        model.addAttribute("degreeList", iEducationDegreeService.findAll());
        model.addAttribute("divisionList", iDivisionService.findAll());
        return "/employee/list";
    }


    @PostMapping("/save/user")
    public ResponseEntity<?> createUser(@RequestBody User user){
        iUserService.save(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/save/employee")
    public ResponseEntity<?> createEmployee(@RequestBody Employee employee){
        iEmployeeService.save(employee);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute Employee employee, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("positionList", iPositionService.findAll());
            model.addAttribute("degreeList", iEducationDegreeService.findAll());
            model.addAttribute("divisionList", iDivisionService.findAll());
            model.addAttribute("userList", iUserService.findAll());
            return "/employee/create";
        } else {
            iEmployeeService.save(employee);
            redirectAttributes.addFlashAttribute("message", "Add new successful");
            return "redirect:/employees";
        }
    }
}
