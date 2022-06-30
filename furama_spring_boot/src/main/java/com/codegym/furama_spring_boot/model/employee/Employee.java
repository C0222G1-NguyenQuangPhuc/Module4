package com.codegym.furama_spring_boot.model.employee;

import javax.persistence.*;

@Entity(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "employee_name")
    private String employeeName;

    @Column(name = "employee_birthday")
    private String employeeBirthDay;

    @Column(name = "employee_id_card")
    private Integer employeeIdCard;

    @Column(name = "employee_salary")
    private Double employeeSalary;

    @Column(name = "employee_phone")
    private String employeePhone;

    @Column(name = "employee_email")
    private String employeeEmail;

    @Column(name = "employee_address")
    private String employeeAddress;

    @ManyToOne
    @JoinColumn(name = "position_id", referencedColumnName = "position_id")
    private Position position;


    @ManyToOne
    @JoinColumn(name = "education_degree_id", referencedColumnName = "education_degree_id")
    private EducationDegree educationDegree;

    @ManyToOne
    @JoinColumn(name = "division_id", referencedColumnName = "division_id")
    private Division division;

    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "user_id")
    private User user;

    public Employee() {
    }

    public Employee(Integer employeeId, String employeeName, String employeeBirthDay, Integer employeeIdCard, Double employeeSalary, String employeePhone, String employeeEmail, String employeeAddress, Position position, EducationDegree educationDegree, Division division, User user) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeBirthDay = employeeBirthDay;
        this.employeeIdCard = employeeIdCard;
        this.employeeSalary = employeeSalary;
        this.employeePhone = employeePhone;
        this.employeeEmail = employeeEmail;
        this.employeeAddress = employeeAddress;
        this.position = position;
        this.educationDegree = educationDegree;
        this.division = division;
        this.user = user;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeBirthDay() {
        return employeeBirthDay;
    }

    public void setEmployeeBirthDay(String employeeBirthDay) {
        this.employeeBirthDay = employeeBirthDay;
    }

    public Integer getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(Integer employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
