package com.codegym.furama_spring.repository.facility;

import com.codegym.furama_spring.model.facility.RentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IRentTypeRepository extends JpaRepository<RentType, Integer> {
}
