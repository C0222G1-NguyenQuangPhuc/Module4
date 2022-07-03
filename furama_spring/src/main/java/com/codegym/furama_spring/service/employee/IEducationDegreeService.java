package com.codegym.furama_spring.service.employee;

import com.codegym.furama_spring.model.employee.EducationDegree;

import java.util.List;

public interface IEducationDegreeService {
    List<EducationDegree> findAll();
}
