package com.codegym.service;

import com.codegym.model.Blog;

import java.util.List;

public interface IBlogService {

    List<Blog> findAllBlog();

    void save(Blog blog);

    Blog findByIdBlog(Integer id);

    void update(Blog blog);

    void delete(Integer id);
}
