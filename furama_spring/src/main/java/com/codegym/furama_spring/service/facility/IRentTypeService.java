package com.codegym.furama_spring.service.facility;

import com.codegym.furama_spring.model.facility.RentType;

import java.util.List;

public interface IRentTypeService {
    List<RentType> findAll();
}
