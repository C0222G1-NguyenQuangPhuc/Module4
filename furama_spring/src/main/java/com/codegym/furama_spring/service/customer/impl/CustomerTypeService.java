package com.codegym.furama_spring.service.customer.impl;

import com.codegym.furama_spring.model.customer.CustomerType;
import com.codegym.furama_spring.repository.customer.ICustomerTypeRepository;
import com.codegym.furama_spring.service.customer.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeService implements ICustomerTypeService {
    @Autowired
    private ICustomerTypeRepository iCustomerTypeRepository;

    @Override
    public List<CustomerType> getAllCustomerType(){
       return iCustomerTypeRepository.findAll();
    }
}
