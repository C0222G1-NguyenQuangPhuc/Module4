package com.codegym.aop_library.service.impl;

import com.codegym.aop_library.model.Book;
import com.codegym.aop_library.repository.IBookRepository;
import com.codegym.aop_library.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {

    @Autowired
    private IBookRepository iBookRepository;

    @Override
    public List<Book> findAll(){
        return iBookRepository.findAll();
    }

    @Override
    public Book findById(Integer id){
        return iBookRepository.findById(id).get();
    }

    @Override
    public void update(Book book){
        book.setQuantity(book.getQuantity() - 1);
        iBookRepository.save(book);
    }

    @Override
    public void giveBack(Book book){
        iBookRepository.save(book);
    }

    @Override
    public boolean checkQuantity(Integer quantity) {
        if (quantity == 0){
            return false;
        }else {
            return true;
        }
    }
}
