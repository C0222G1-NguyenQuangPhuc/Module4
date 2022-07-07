package com.codegym.furama_spring.service.contract;

import com.codegym.furama_spring.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IContractService {
    Page<Contract> findAllContract(Pageable pageable);
}
