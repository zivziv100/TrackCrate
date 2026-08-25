package com.zivziv.trackcrate.data;

import com.zivziv.trackcrate.model.Song;

import java.util.List;

public interface SongRepository {
    List<Song> getAllSongs();
    Song getSongById(long id);
    List<Song> searchSongs(String query);
}
