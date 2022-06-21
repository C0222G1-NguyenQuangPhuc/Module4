package com.codegym.model;

import javax.persistence.*;

@Entity(name = "blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_blog")
    private Integer idBlog;
    @Column(name = "name_blog")
    private String nameBlog;
    private String author;
    private String description;
    @Column(name = "date_create")
    private String dateCreate;
    @Column(name = "status_delete")
    private Integer statusDelete;

    public Blog() {
    }

    public Blog(Integer idBlog, String nameBlog, String author, String description, String dateCreate, Integer statusDelete) {
        this.idBlog = idBlog;
        this.nameBlog = nameBlog;
        this.author = author;
        this.description = description;
        this.dateCreate = dateCreate;
        this.statusDelete = statusDelete;
    }

    public Integer getIdBlog() {
        return idBlog;
    }

    public void setIdBlog(Integer idBlog) {
        this.idBlog = idBlog;
    }

    public String getNameBlog() {
        return nameBlog;
    }

    public void setNameBlog(String nameBlog) {
        this.nameBlog = nameBlog;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Integer getStatusDelete() {
        return statusDelete;
    }

    public void setStatusDelete(Integer statusDelete) {
        this.statusDelete = statusDelete;
    }
}
