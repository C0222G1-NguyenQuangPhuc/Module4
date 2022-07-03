package com.codegym.furama_spring.model.employee;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class UserRoleTest implements Serializable {

    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "role_id")
    private Role role;

    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username")
    private User user;


}
