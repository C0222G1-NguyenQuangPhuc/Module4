package com.codegym.furama_spring.repository.customer;

import com.codegym.furama_spring.model.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ICustomerTypeRepository extends JpaRepository<CustomerType, Integer> {
}
