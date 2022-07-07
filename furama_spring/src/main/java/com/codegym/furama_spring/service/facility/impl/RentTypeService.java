package com.codegym.furama_spring.service.facility.impl;

import com.codegym.furama_spring.model.facility.RentType;
import com.codegym.furama_spring.repository.facility.IRentTypeRepository;
import com.codegym.furama_spring.service.facility.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeService implements IRentTypeService {

    @Autowired
    private IRentTypeRepository iRentTypeRepository;

    @Override
    public List<RentType> findAll(){
        return iRentTypeRepository.findAll();
    }
}
