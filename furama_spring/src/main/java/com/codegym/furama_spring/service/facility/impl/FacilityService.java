package com.codegym.furama_spring.service.facility.impl;

import com.codegym.furama_spring.model.facility.Facility;
import com.codegym.furama_spring.repository.facility.IFacilityRepository;
import com.codegym.furama_spring.service.facility.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FacilityService implements IFacilityService {

    @Autowired
    private IFacilityRepository iFacilityRepository;

    @Override
    public Page<Facility> findAllFacility(Pageable pageable) {
        return iFacilityRepository.findAllFacility(pageable);
    }

    @Override
    public void save(Facility facility) {
        iFacilityRepository.save(facility);
    }

    @Override
    public void delete(Integer id){
        iFacilityRepository.deleteById(id);
    }
}
