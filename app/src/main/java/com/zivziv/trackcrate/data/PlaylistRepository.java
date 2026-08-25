package com.zivziv.trackcrate.data;

import com.zivziv.trackcrate.model.Playlist;
import java.util.List;

public interface PlaylistRepository {
    List<Playlist> getAllPlaylists();
    Playlist getPlaylistById(long id);
    long savePlaylist(Playlist playlist);
    void deletePlaylist(long playlistId);
    void addSongToPlaylist(long playlistId, long songId);
    void removeSongFromPlaylist(long playlistId, long songId);

}
