package com.codegym.validation_music.controller;

import com.codegym.validation_music.model.Song;
import com.codegym.validation_music.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/songs")
public class SongController {

    @Autowired
    private ISongService iSongService;

    @GetMapping("")
    public String home(Model model) {
        List<Song> songList = iSongService.findAll();
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
    public String save(@Valid Song song, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/create";
        } else {
            iSongService.save(song);
            return "redirect:/songs";
        }
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("song", iSongService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(@Valid Song song, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/edit";
        } else {
            iSongService.update(song);
            return "redirect:/songs";
        }
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Integer id, Model model) {
        model.addAttribute("song", iSongService.findById(id));
        return "/delete";
    }

}
