package com.codegym.furama_spring.service.facility.impl;

import com.codegym.furama_spring.model.facility.FacilityType;
import com.codegym.furama_spring.repository.facility.IFacilityTypeRepository;
import com.codegym.furama_spring.service.facility.IFacilityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityTypeService implements IFacilityTypeService {

    @Autowired
    private IFacilityTypeRepository iFacilityTypeRepository;

    @Override
    public List<FacilityType> findAll(){
        return iFacilityTypeRepository.findAll();
    }
}
