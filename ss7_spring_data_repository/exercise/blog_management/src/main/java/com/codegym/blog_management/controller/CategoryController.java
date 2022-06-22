package com.codegym.blog_management.controller;

import com.codegym.blog_management.model.Category;
import com.codegym.blog_management.service.IBlogService;
import com.codegym.blog_management.service.ICategoryService;
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
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private IBlogService iBlogService;

    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("")
    public String home(Model model) {
        List<Category> categories = iCategoryService.findAllCategory();
        model.addAttribute("categories", categories);
        model.addAttribute("category", new Category());
        return "/category/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("category", new Category());
        return "/category/create";
    }

    @PostMapping("/save")
    public String save(Category category) {
        iCategoryService.save(category);
        return "redirect:/category";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("category", iCategoryService.findByIdCategory(id));
        return "/category/edit";
    }

    @PostMapping("/update")
    public String update(Category category) {
        iCategoryService.update(category);
        return "redirect:/category";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Integer id, Model model) {
        model.addAttribute("category", iCategoryService.findByIdCategory(id));
        return "/category/delete";
    }

    @PostMapping("/delete")
    public String delete(Category category, RedirectAttributes redirect) {
        iBlogService.delete(category.getIdCategory());
        redirect.addFlashAttribute("success", "Removed product successfully!");
        return "redirect:/blogs";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("category", iBlogService.findByIdBlog(id));
        return "/category/view";
    }

    @GetMapping("/search")
    public String searchProduct(Model model) {
        model.addAttribute("categories", iCategoryService.findAllCategory());
        return "/category/list";
    }
}
