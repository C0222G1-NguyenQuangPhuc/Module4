package com.codegym.validation_music.model;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity(name = "song")
@Table
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSong;
    @Pattern(regexp = "^\\w{5,800}$", message = "Wrong format, name song has more than 5 characters")
    private String nameSong;
    @Pattern(regexp = "^\\w{5,300}$", message = "Wrong format, name artist has more than 5 characters")
    private String artist;
    @Pattern(regexp = "^\\w{5,1000}$", message = "Wrong format, type music has more than 5 characters")
    private String type;
    @Pattern(regexp = "^\\w{5,1000}$", message = "Wrong format, link has more than 5 characters")
    private String link;

    public Song() {
    }

    public Integer getIdSong() {
        return idSong;
    }

    public void setIdSong(Integer idSong) {
        this.idSong = idSong;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
