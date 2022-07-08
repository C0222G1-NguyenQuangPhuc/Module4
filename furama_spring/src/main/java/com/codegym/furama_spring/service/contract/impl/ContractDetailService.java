package com.codegym.furama_spring.service.contract.impl;

import com.codegym.furama_spring.model.contract.ContractDetail;
import com.codegym.furama_spring.repository.contract.IContractDetailRepository;
import com.codegym.furama_spring.service.contract.IContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailService implements IContractDetailService {

    @Autowired
    private IContractDetailRepository iContractDetailRepository;

    @Override
    public List<ContractDetail> findAll(){
        return iContractDetailRepository.findAll();
    }
}
