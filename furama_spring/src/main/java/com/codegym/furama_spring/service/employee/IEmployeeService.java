package com.codegym.furama_spring.service.employee;

import com.codegym.furama_spring.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IEmployeeService {

    Page<Employee> findAllEmployee(Pageable pageable);

    void save(Employee employee);

    void deleteById(Integer id);

    Page<Employee> searchByName(String keyword, Pageable pageable);

}
