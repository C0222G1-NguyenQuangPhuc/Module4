package com.codegym.furama_spring.service.employee;

import com.codegym.furama_spring.model.employee.Position;

import java.util.List;

public interface IPositionService {
    List<Position> findAll();
}
