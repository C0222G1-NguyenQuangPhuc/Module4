package com.codegym.aop_library.service;

import com.codegym.aop_library.model.Book;

import java.util.List;

public interface IBookService {

    List<Book> findAll();

    Book findById(Integer id);

    void update(Book book);

    void giveBack(Book book);

    boolean checkQuantity(Integer quantity);

}
