package com.codegym.furama_spring.service.employee;

import com.codegym.furama_spring.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IEmployeeService {

    Page<Employee> findAllEmployee(Pageable pageable);

    void save(Employee employee);
}
