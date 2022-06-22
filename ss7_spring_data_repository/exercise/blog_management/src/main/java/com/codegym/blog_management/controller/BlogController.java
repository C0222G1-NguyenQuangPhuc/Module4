package com.codegym.blog_management.controller;

import com.codegym.blog_management.model.Blog;
import com.codegym.blog_management.service.IBlogService;
import com.codegym.blog_management.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("blogs")
public class BlogController {
    @Autowired
    private IBlogService iBlogService;

    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("")
    public String home(@RequestParam(name = "page", defaultValue = "0") int page, Model model) {
        Sort sort = Sort.by("date_create").ascending();
        Page<Blog> blogList = iBlogService.findAllBlog(PageRequest.of(page, 2, sort));
        model.addAttribute("blogList", blogList);
        model.addAttribute("blog", new Blog());
        return "/blog/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("listCategory", iCategoryService.findAllCategory());
        return "/blog/create";
    }

    @PostMapping("/save")
    public String save(Blog blog) {
        iBlogService.save(blog);
        return "redirect:/blogs";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("blog", iBlogService.findByIdBlog(id));
        model.addAttribute("listCategory", iCategoryService.findAllCategory());
        return "/blog/edit";
    }

    @PostMapping("/update")
    public String update(Blog blog) {
        iBlogService.update(blog);
        return "redirect:/blogs";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Integer id, Model model) {
        model.addAttribute("blog", iBlogService.findByIdBlog(id));
        return "/blog/delete";
    }

    @PostMapping("/delete")
    public String delete(Blog blog, RedirectAttributes redirect) {
        iBlogService.delete(blog.getIdBlog());
        redirect.addFlashAttribute("success", "Removed product successfully!");
        return "redirect:/blogs";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("blog", iBlogService.findByIdBlog(id));
        return "/blog/view";
    }

    @GetMapping("/search")
    public String searchProduct(@RequestParam(name = "page", defaultValue = "0") int page, Blog blog, Model model) {
        Sort sort = Sort.by("date_create").ascending();
        model.addAttribute("blogList", iBlogService.findAllBlogByName(PageRequest.of(page, 2, sort), blog));
        return "/blog/list";
    }
}
