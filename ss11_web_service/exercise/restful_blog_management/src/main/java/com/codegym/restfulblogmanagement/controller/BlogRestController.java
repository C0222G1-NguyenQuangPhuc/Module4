package com.codegym.restfulblogmanagement.controller;

import com.codegym.restfulblogmanagement.model.Blog;
import com.codegym.restfulblogmanagement.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blogs")
public class BlogRestController {

    @Autowired
    private IBlogService iBlogService;

    @GetMapping("")
    public ResponseEntity<?> home(@RequestParam(name = "page", defaultValue = "0") int page, Model model) {
        Sort sort = Sort.by("name_blog").ascending();
        Page<Blog> blogList = iBlogService.findAllBlog(PageRequest.of(page, 2, sort));
        if (blogList.isEmpty()){
         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findByIdBlog(@PathVariable Integer id) {
        Blog blog = iBlogService.findByIdBlog(id);
        if (blog == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Blog> saveBlog(@RequestBody Blog blog) {
        iBlogService.save(blog);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
