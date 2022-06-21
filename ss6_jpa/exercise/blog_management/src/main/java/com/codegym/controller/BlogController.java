package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("blogs")
public class BlogController {
    @Autowired
    private IBlogService iBlogService;

    @GetMapping("")
    public String home(Model model) {
        List<Blog> blogList = iBlogService.findAllBlog();
        model.addAttribute("blogList", blogList);
        model.addAttribute("blog", new Blog());
        return "/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("blog", new Blog());
        return "/create";
    }

    @PostMapping("/save")
    public String save(Blog blog) {
        iBlogService.save(blog);
        return "redirect:/blogs";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("blog", iBlogService.findByIdBlog(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Blog blog) {
        iBlogService.update(blog);
        return "redirect:/blogs";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Integer id, Model model) {
        model.addAttribute("blog", iBlogService.findByIdBlog(id));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(Blog blog, RedirectAttributes redirect) {
        iBlogService.delete(blog.getIdBlog());
        redirect.addFlashAttribute("success", "Removed product successfully!");
        return "redirect:/blogs";
    }
}
