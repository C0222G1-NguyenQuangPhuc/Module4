package com.codegym.validate_infor_user.service;

import com.codegym.validate_infor_user.model.User;
import com.codegym.validate_infor_user.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements  IUserService{
    @Autowired
    private IUserRepository iUserRepository;

    @Override
    public void save(User user) {
        iUserRepository.save(user);
    }
}
