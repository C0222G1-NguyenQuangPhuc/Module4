package com.codegym.furama_spring.service.employee.impl;

import com.codegym.furama_spring.model.employee.Position;
import com.codegym.furama_spring.repository.employee.IPositionRepository;
import com.codegym.furama_spring.service.employee.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService implements IPositionService {

    @Autowired
    private IPositionRepository iPositionRepository;

    @Override
    public List<Position> findAll(){
        return iPositionRepository.findAll();
    }
}
