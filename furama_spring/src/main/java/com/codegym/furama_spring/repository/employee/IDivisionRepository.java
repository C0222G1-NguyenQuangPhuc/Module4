package com.codegym.furama_spring.repository.employee;

import com.codegym.furama_spring.model.employee.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IDivisionRepository extends JpaRepository<Division, Integer> {
}
