package com.codegym.service;

import com.codegym.model.Blog;
import com.codegym.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService{
    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public List<Blog> findAllBlog() {
        return iBlogRepository.findAllBlog();
    }

    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog.getNameBlog(), blog.getAuthor(), blog.getDescription(), blog.getDateCreate());
    }

    @Override
    public Blog findByIdBlog(Integer id) {
        return iBlogRepository.findByIdBlog(id);
    }

    @Override
    public void update(Blog blog) {
        iBlogRepository.update(blog.getNameBlog(), blog.getAuthor(), blog.getDescription(), blog.getDateCreate(), blog.getIdBlog());
    }

    @Override
    public void delete(Integer id) {
        iBlogRepository.delete(id);
    }

}
