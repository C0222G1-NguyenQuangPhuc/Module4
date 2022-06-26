package com.codegym.furama_spring_boot.controller;

import com.codegym.furama_spring_boot.model.customer.Customer;
import com.codegym.furama_spring_boot.service.customer.ICustomerService;
import com.codegym.furama_spring_boot.service.customer.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private ICustomerService iCustomerService;

    @Autowired
    private ICustomerTypeService iCustomerTypeService;

    @GetMapping("")
    public String showListCustomer(@RequestParam(name = "page", defaultValue = "0") int page, Model model) {
        Sort sort = Sort.by("customer_name").ascending();
        Page<Customer> customerList = iCustomerService.findAllCustomer(PageRequest.of(page, 2, sort));
        model.addAttribute("customerList", customerList);
        model.addAttribute("customer", new Customer());
        return "/customer/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("typeList", iCustomerTypeService.getAllCustomerType());
        return "/customer/create";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute Customer customer, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("typeList", iCustomerTypeService.getAllCustomerType());
            return "/customer/create";
        } else {
            iCustomerService.save(customer);
            redirectAttributes.addFlashAttribute("message", "Add new successful");
            return "/customer/create";
        }
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("customer", iCustomerService.findByIdCustomer(id));
        model.addAttribute("typeList", iCustomerTypeService.getAllCustomerType());
        return "/customer/edit";
    }

    @PostMapping("/update")
    public String update(@Valid @ModelAttribute Customer customer, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("typeList", iCustomerTypeService.getAllCustomerType());
            return "customer/edit";
        }
        else {
            iCustomerService.update(customer);
            redirectAttributes.addFlashAttribute("message", "Update successful");
            return "redirect:/customers";
        }
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id, Model model, RedirectAttributes redirectAttributes) {
        iCustomerService.delete(id);
        redirectAttributes.addFlashAttribute("message", "Delete successful");
        return "redirect:/customers";
    }
}
