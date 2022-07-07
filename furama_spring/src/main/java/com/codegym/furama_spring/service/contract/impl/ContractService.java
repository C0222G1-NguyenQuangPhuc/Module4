package com.codegym.furama_spring.service.contract.impl;

import com.codegym.furama_spring.model.contract.Contract;
import com.codegym.furama_spring.repository.contract.IContractRepository;
import com.codegym.furama_spring.service.contract.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ContractService implements IContractService {

    @Autowired
    private IContractRepository iContractRepository;

    @Override
    public Page<Contract> findAllContract(Pageable pageable){
        return iContractRepository.findAllContract(pageable);
    }
}
