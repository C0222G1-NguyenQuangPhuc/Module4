package com.codegym.furama_spring.service.contract;

import com.codegym.furama_spring.model.contract.ContractDetail;

import java.util.List;

public interface IContractDetailService {
    List<ContractDetail> findAll();
}
