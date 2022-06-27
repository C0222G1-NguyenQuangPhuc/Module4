package com.codegym.aop_library.service.impl;

import com.codegym.aop_library.model.OrderBook;
import com.codegym.aop_library.repository.IOrderBookRepository;
import com.codegym.aop_library.service.IOrderBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderBookService implements IOrderBookService {

    @Autowired
    private IOrderBookRepository iOrderBookRepository;

    @Override
    public void save(OrderBook orderBook){
        iOrderBookRepository.save(orderBook);
    }

    @Override
    public OrderBook findByOrderBookCode(Integer code){
        return iOrderBookRepository.findByOrderBookCode(code);
    }

    @Override
    public void delete(OrderBook orderBook){
        iOrderBookRepository.delete(orderBook);
    }
}
