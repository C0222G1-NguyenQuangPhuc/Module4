package com.codegym.aop_library.repository;

import com.codegym.aop_library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IBookRepository extends JpaRepository<Book, Integer> {


}
