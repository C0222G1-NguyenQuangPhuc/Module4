package com.codegym.furama_spring.service.facility;

import com.codegym.furama_spring.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IFacilityService {

    Page<Facility> findAllFacility(Pageable pageable);

    void save(Facility facility);

    void delete(Integer id);
}
