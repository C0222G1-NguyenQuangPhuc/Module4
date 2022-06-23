package com.codegym.validation_music.service;

import com.codegym.validation_music.model.Song;

import java.util.List;
import java.util.Optional;

public interface ISongService {

    List<Song> findAll();

    void save(Song song);

    Optional<Song> findById(Integer id);

    void update(Song song);
}
