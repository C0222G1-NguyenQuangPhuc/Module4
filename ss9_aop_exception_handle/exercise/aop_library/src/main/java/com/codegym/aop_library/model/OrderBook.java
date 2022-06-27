package com.codegym.aop_library.model;

import javax.persistence.*;

@Entity
public class OrderBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_book_id")
    private Integer orderBookId;

    @Column(name = "order_book_code")
    private Integer orderBookCode;

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "book_id")
    private Book book;

    public OrderBook() {
    }

    public OrderBook(Integer orderBookCode, Book book) {
        this.orderBookCode = orderBookCode;
        this.book = book;
    }

    public OrderBook(Integer orderBookId, Integer orderBookCode, Book book) {
        this.orderBookId = orderBookId;
        this.orderBookCode = orderBookCode;
        this.book = book;
    }

    public Integer getOrderBookId() {
        return orderBookId;
    }

    public void setOrderBookId(Integer orderBookId) {
        this.orderBookId = orderBookId;
    }

    public Integer getOrderBookCode() {
        return orderBookCode;
    }

    public void setOrderBookCode(Integer orderBookCode) {
        this.orderBookCode = orderBookCode;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
