package com.codegym.validation_music.repository;

import com.codegym.validation_music.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ISongRepository extends JpaRepository<Song, Integer> {

}
