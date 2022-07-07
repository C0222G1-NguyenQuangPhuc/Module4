package com.codegym.furama_spring.controller;

import com.codegym.furama_spring.model.contract.Contract;
import com.codegym.furama_spring.model.employee.Employee;
import com.codegym.furama_spring.service.contract.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/contract")
public class ContractController {

    @Autowired
    private IContractService iContractService;

    @GetMapping("")
    public ModelAndView showListContract(@RequestParam(name = "page", defaultValue = "0") int page) {
        Sort sort = Sort.by("contract_id").ascending();
        ModelAndView model = new ModelAndView("/contract/list");
        Page<Contract> contractList = iContractService.findAllContract(PageRequest.of(page, 4, sort));
        model.addObject("contractList", contractList);
        return model;
    }
}
