package com.codegym.furama_spring.repository.contract;

import com.codegym.furama_spring.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IContractRepository extends JpaRepository<Contract, Integer> {

    @Query(value = "select * from contract ", nativeQuery = true)
    Page<Contract> findAllContract(Pageable pageable);
}
