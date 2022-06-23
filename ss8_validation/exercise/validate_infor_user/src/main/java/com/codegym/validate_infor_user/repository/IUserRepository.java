package com.codegym.validate_infor_user.repository;

import com.codegym.validate_infor_user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IUserRepository extends JpaRepository<User, String> {

}
