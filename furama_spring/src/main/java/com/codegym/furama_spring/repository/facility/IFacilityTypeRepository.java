package com.codegym.furama_spring.repository.facility;

import com.codegym.furama_spring.model.facility.FacilityType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IFacilityTypeRepository extends JpaRepository<FacilityType, Integer> {
}
