package com.codegym.furama_spring.service.customer;

import com.codegym.furama_spring.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService {

    Page<Customer> findAllCustomer(Pageable pageable);

    void save(Customer customer);

    Customer findByIdCustomer(Integer id);

    void update(Customer customer);

    void delete(Integer id);
//
//    Page<Customer> findAllCustomerByName(Pageable pageable, Customer customer);
}
