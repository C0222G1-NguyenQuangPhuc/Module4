package com.codegym.repository;

import com.codegym.model.Song;

import java.util.List;

public interface ISongRepository {

    List<Song> getAll();

    void save(Song song);

    Song findById(Long id);

    void update(Song song);

    void remove(Song song);

    List<Song> searchByName(Song song);

}
