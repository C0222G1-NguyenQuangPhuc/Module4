package com.codegym.aop_library.service;

import com.codegym.aop_library.model.OrderBook;

public interface IOrderBookService {

    void save(OrderBook orderBook);

    OrderBook findByOrderBookCode(Integer code);

    void delete(OrderBook orderBook);
}
