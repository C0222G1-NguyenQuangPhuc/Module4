package com.codegym.validate_infor_user.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity(name = "user")
public class User {
    @Size(min = 5, max = 45, message = "First name has more than 5 characters and less than 45 characters")
    private String firstName;
    @Id
    @Size(min = 5, max = 45, message = "Last name has more than 5 characters and less than 45 characters")
    private String lastName;
    @Pattern(regexp = "^(09|07|03)\\d{8}$", message = "Wrong format, For ex: (09|03|07)-XXXXXXXX")
    private String phone;
    @Min(value = 18, message = "Age must be more than 0")
    private Integer age;
    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "Wrong format, For ex: abc@gmail.com")
    private String email;

    public User() {
    }

    public User(@Size(min = 5, max = 45, message = "First name has more than 5 characters and less than 45 characters") String firstName,
                @Size(min = 5, max = 45, message = "Last name has more than 5 characters and less than 45 characters") String lastName,
                @Pattern(regexp = "^(09|07|03)\\d{8}$", message = "Wrong format, For ex: (09|03|07)-XXXXXXXX") String phone,
                @Min(18) Integer age,
                @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "Wrong format, For ex: abc@gmail.com") String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.age = age;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
