package com.codegym.validation_music.service;

import com.codegym.validation_music.model.Song;
import com.codegym.validation_music.repository.ISongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongService implements ISongService {
    @Autowired
    private ISongRepository iSongRepository;


    @Override
    public List<Song> findAll() {
        return iSongRepository.findAll();
    }

    @Override
    public void save(Song song) {
        iSongRepository.save(song);
    }

    @Override
    public Optional<Song> findById(Integer id) {
        return iSongRepository.findById(id);
    }

    @Override
    public void update(Song song) {
        iSongRepository.save(song);
    }
}
