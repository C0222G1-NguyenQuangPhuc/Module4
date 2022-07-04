package com.codegym.restfulblogmanagement.repository;

import com.codegym.restfulblogmanagement.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    AppUser findByUserName(String username);
}
