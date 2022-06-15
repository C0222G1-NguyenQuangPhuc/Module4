package com.codegym.service;

import org.springframework.stereotype.Service;

@Service
public class ConvertServiceImpl implements IConvertService{
    @Override
    public Double convert(Double money) {
        return money * 23000;
    }
}
