package com.codegym.furama_spring.repository.employee;

import com.codegym.furama_spring.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query(value = "select * from employee where status_delete = 1", nativeQuery = true)
    Page<Employee> findAllEmployee(Pageable pageable);

//    @Modifying
//    @Query(value = "insert into employee (employee_name, employee_birthday, employee_id_card, employee_salary, employee_phone, employee_email, employee_address, position_id, education_degree_id, division_id, username, status_delete) " +
//            "       values (:name, :birth, :idCard, :salary, :phone, :email, :address, :position, :degree, division, username, 1)", nativeQuery = true)
//    void save(@Param("name") String name, @Param("birth") String birth, @Param("idCard") String idCard, @Param("salary") Double salary, @Param("phone") String phone, @Param("email") String email, @Param("address") String address, @Param("position") Integer position, @Param("degree") Integer degree, @Param("division") Integer division, @Param("username") String username);

}
