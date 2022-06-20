package com.codegym.service;

import com.codegym.model.Song;
import com.codegym.repository.ISongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService implements ISongService {
    @Autowired
    private ISongRepository iSongRepository;

    @Override
    public List<Song> getAll() {
        return iSongRepository.getAll();
    }

    @Override
    public void save(Song song) {
        iSongRepository.save(song);
    }

    @Override
    public Song findById(Long id) {
        return iSongRepository.findById(id);
    }

    @Override
    public void update(Song song) {
        iSongRepository.update(song);
    }

    @Override
    public void remove(Song song) {
        iSongRepository.remove(song);
    }

    @Override
    public List<Song> searchByName(Song song) {
        return iSongRepository.searchByName(song);
    }
}
