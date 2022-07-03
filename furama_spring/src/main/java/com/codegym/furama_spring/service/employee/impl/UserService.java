package com.codegym.furama_spring.service.employee.impl;

import com.codegym.furama_spring.model.employee.User;
import com.codegym.furama_spring.repository.employee.IUserRepository;
import com.codegym.furama_spring.service.employee.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository iUserRepository;

    @Override
    public List<User> findAll() {
        return iUserRepository.findAll();
    }

    @Override
    public void save(User user) {
        iUserRepository.save(user);
    }
}
