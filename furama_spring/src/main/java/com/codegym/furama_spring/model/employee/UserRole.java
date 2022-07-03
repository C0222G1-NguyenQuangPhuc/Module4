package com.codegym.furama_spring.model.employee;

import javax.persistence.*;

@Entity(name = "user_role")
public class UserRole {

    @EmbeddedId
    private UserRoleTest role;

}
