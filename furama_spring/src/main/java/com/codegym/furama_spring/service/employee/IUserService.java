package com.codegym.furama_spring.service.employee;

import com.codegym.furama_spring.model.employee.User;

import java.util.List;

public interface IUserService {

    public List<User> findAll();

    public void save(User user);
}
