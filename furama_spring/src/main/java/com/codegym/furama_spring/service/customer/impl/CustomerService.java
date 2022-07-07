package com.codegym.furama_spring.service.customer.impl;

import com.codegym.furama_spring.model.customer.Customer;
import com.codegym.furama_spring.repository.customer.ICustomerRepository;
import com.codegym.furama_spring.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;


    @Override
    public Page<Customer> findAllCustomer(Pageable pageable) {
        return iCustomerRepository.findAllCustomer(pageable);
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer.getCustomerCode(), customer.getCustomerType().getCustomerTypeId(), customer.getCustomerName(), customer.getCustomerBirth(), customer.getCustomerGender(), customer.getCustomerIdCard(), customer.getCustomerPhone(), customer.getCustomerEmail(), customer.getCustomerAddress());
    }

    @Override
    public Customer findByIdCustomer(Integer id) {
        return iCustomerRepository.findByIdCustomer(id);
    }

    @Override
    public void update(Customer customer) {
        iCustomerRepository.update(customer.getCustomerCode(),
                customer.getCustomerType().getCustomerTypeId(),
                customer.getCustomerName(),
                customer.getCustomerBirth(),
                customer.getCustomerGender(),
                customer.getCustomerIdCard(),
                customer.getCustomerPhone(),
                customer.getCustomerEmail(),
                customer.getCustomerAddress(),
                customer.getCustomerId());
    }


    @Override
    public void delete(Integer id) {
        iCustomerRepository.delete(id);
    }

//    @Override
//    public Page<Customer> findAllCustomerByName(Pageable pageable, Customer customer) {
//        return iCustomerRepository.findAllCustomerByName(pageable, "%" + customer.getCustomerName() + "%");
//    }
}
