package com.codegym.furama_spring.service.contract;

import com.codegym.furama_spring.model.contract.AttachFacility;

import java.util.List;

public interface IAttachFacilityService {
    List<AttachFacility> findAll();
}
