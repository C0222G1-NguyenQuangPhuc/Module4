package com.codegym.furama_spring.service.employee.impl;

import com.codegym.furama_spring.model.employee.EducationDegree;
import com.codegym.furama_spring.repository.employee.IEducationDegreeRepository;
import com.codegym.furama_spring.service.employee.IEducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeService implements IEducationDegreeService {

    @Autowired
    private IEducationDegreeRepository iEducationDegreeRepository;

    @Override
    public List<EducationDegree> findAll() {
        return iEducationDegreeRepository.findAll();
    }
}
