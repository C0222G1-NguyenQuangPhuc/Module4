package com.codegym.repository;

import com.codegym.model.Song;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import java.util.List;

@Repository
public class SongRepository implements ISongRepository {

    @Override
    public List<Song> getAll() {
        List<Song> songs = BaseRepository.entityManager.createQuery("select s from song s", Song.class).getResultList();
        return songs;
    }

    @Override
    public void save(Song song) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(song);
        entityTransaction.commit();
    }

    @Override
    public Song findById(Long id) {
        Song song = BaseRepository.entityManager.createQuery("select s from song s where s.idSong = ?1", Song.class).setParameter(1, id).getSingleResult();
        return song;
    }

    @Override
    public void update(Song song) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(song);
        entityTransaction.commit();
    }

    @Override
    public void remove(Song song) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.remove(findById(song.getIdSong()));
        entityTransaction.commit();
    }

    @Override
    public List<Song> searchByName(Song song) {
        List<Song> searchList = BaseRepository.entityManager.createQuery("select s from song s where s.nameSong like ?1", Song.class).setParameter(1, "%" + song.getNameSong() + "%").getResultList();
        return searchList;
    }

}
