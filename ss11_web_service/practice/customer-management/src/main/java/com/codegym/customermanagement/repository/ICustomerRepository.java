package com.codegym.customermanagement.repository;

import com.codegym.customermanagement.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Long> {
}
