package com.codegym.aop_library.repository;

import com.codegym.aop_library.model.OrderBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IOrderBookRepository extends JpaRepository<OrderBook, Integer> {

    OrderBook findByOrderBookCode(Integer code);
}
