package com.codegym.furama_spring.service.employee.impl;

import com.codegym.furama_spring.model.employee.Employee;
import com.codegym.furama_spring.repository.employee.IEmployeeRepository;
import com.codegym.furama_spring.service.employee.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private IEmployeeRepository iEmployeeRepository;

    @Override
    public Page<Employee> findAllEmployee(Pageable pageable) {
        return iEmployeeRepository.findAllEmployee(pageable);
    }

    @Override
    public void save(Employee employee) {
        iEmployeeRepository.save(employee);
    }

    @Override
    public void deleteById(Integer id) {
        iEmployeeRepository.deleteById(id);
    }

    @Override
    public Page<Employee> searchByName(String keyword, Pageable pageable) {
        return iEmployeeRepository.searchByName("%" + keyword + "%", pageable);
    }
}
