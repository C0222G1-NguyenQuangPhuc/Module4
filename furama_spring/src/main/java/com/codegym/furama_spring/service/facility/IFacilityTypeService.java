package com.codegym.furama_spring.service.facility;

import com.codegym.furama_spring.model.facility.FacilityType;

import java.util.List;

public interface IFacilityTypeService {
    List<FacilityType> findAll();
}
