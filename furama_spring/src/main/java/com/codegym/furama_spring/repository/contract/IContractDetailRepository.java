package com.codegym.furama_spring.repository.contract;

import com.codegym.furama_spring.model.contract.ContractDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IContractDetailRepository extends JpaRepository<ContractDetail, Integer> {
}
