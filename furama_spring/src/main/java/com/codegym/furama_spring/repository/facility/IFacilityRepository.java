package com.codegym.furama_spring.repository.facility;

import com.codegym.furama_spring.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IFacilityRepository extends JpaRepository<Facility, Integer> {

    @Query(value = "select * from facility where status_delete = 0", nativeQuery = true)
    Page<Facility> findAllFacility(Pageable pageable);

    @Modifying
    @Query(value = "update facility set status_delete = 1 where facility_id = :id", nativeQuery = true)
    void deleteById(@Param("id") Integer id);
}
