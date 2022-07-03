package com.codegym.furama_spring.repository.employee;

import com.codegym.furama_spring.model.employee.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IUserRepository extends JpaRepository<User, String> {

}
