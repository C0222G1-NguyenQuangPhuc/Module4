package com.codegym.furama_spring_boot.model.employee;

import javax.persistence.*;

@Entity(name = "user")
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "username")
    private Employee employee;

    public User() {
    }

    public User(Integer userId, String userName, String password, Employee employee) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.employee = employee;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
