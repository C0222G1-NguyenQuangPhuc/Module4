package com.codegym.aop_library.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Integer bookId;

    @Column(name = "book_code")
    private String bookCode;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "author")
    private String author;

    @Column(name = "type")
    private String type;

    @Column(name = "publish_year")
    private String publishYear;

    private Integer quantity;

    @OneToMany(mappedBy = "book")
    private List<OrderBook> orderBooks;

    public Book() {
    }

    public Book(Integer bookId, String bookCode, String bookName, String author, String type, String publishYear, Integer quantity, List<OrderBook> orderBooks) {
        this.bookId = bookId;
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.author = author;
        this.type = type;
        this.publishYear = publishYear;
        this.quantity = quantity;
        this.orderBooks = orderBooks;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public List<OrderBook> getOrderBooks() {
        return orderBooks;
    }

    public void setOrderBooks(List<OrderBook> orderBooks) {
        this.orderBooks = orderBooks;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
