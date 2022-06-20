package com.codegym.controller;

import com.codegym.model.Song;
import com.codegym.service.ISongService;
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
@RequestMapping("/songs")
public class SongController {

    @Autowired
    private ISongService iSongService;

    @GetMapping("")
    public String home(Model model) {
        List<Song> songList = iSongService.getAll();
        model.addAttribute("songList", songList);
        model.addAttribute("song", new Song());
        return "/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("song", new Song());
        return "/create";
    }

    @PostMapping("/save")
    public String save(Song song) {
        iSongService.save(song);
        return "redirect:/songs";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("song", iSongService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Song song) {
        iSongService.update(song);
        return "redirect:/songs";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Long id, Model model) {
        model.addAttribute("song", iSongService.findById(id));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(Song song, RedirectAttributes redirect) {
        iSongService.remove(song);
        redirect.addFlashAttribute("success", "Removed product successfully!");
        return "redirect:/songs";
    }

    @GetMapping("/search")
    public String searchProduct(Song song, Model model) {
        model.addAttribute("songList", iSongService.searchByName(song));
        return "/list";
    }
}
