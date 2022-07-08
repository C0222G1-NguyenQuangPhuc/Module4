package com.codegym.furama_spring.service.contract.impl;

import com.codegym.furama_spring.model.contract.AttachFacility;
import com.codegym.furama_spring.repository.contract.IAttachFacilityRepository;
import com.codegym.furama_spring.service.contract.IAttachFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachFacilityService implements IAttachFacilityService {

    @Autowired
    private IAttachFacilityRepository iAttachFacilityRepository;

    @Override
    public List<AttachFacility> findAll(){
        return iAttachFacilityRepository.findAll();
    }
}
