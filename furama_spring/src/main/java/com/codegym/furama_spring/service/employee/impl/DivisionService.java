package com.codegym.furama_spring.service.employee.impl;

import com.codegym.furama_spring.model.employee.Division;
import com.codegym.furama_spring.repository.employee.IDivisionRepository;
import com.codegym.furama_spring.service.employee.IDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionService implements IDivisionService {

    @Autowired
    private IDivisionRepository iDivisionRepository;

    @Override
    public List<Division> findAll(){
        return iDivisionRepository.findAll();
    }
}
