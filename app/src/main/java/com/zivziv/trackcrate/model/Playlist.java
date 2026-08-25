package com.zivziv.trackcrate.model;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private long id;
    private String name;
    private List<Song> songs;

    public Playlist(long id, String name, List<Song> songs) {
        this.id = id;
        this.name = name;
        this.songs = (songs != null) ? songs : new ArrayList<>();
    }

    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSongs(List<Song> songs) {
        this.songs = (songs != null) ? songs : new ArrayList<>();
    }

    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public List<Song> getSongs() {
        return songs;
    }

    public void addSongLocally(Song song){
        songs.add(song);
    }
    public void removeSongLocally(Song song){
        songs.remove(song);
    }
}
