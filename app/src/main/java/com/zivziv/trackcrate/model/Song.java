package com.zivziv.trackcrate.model;

import android.net.Uri;

public class Song {
    private final long id;
    private final String title;
    private final String artist;
    private final String album;
    private final long duration;
    private final Uri uri;
    private final Uri albumArtUri;

    public Song(long id, String title, String artist, String album, long duration, Uri uri, Uri albumArtUri) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
        this.uri = uri;
        this.albumArtUri = albumArtUri;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public long getDuration() {
        return duration;
    }

    public Uri getUri() {
        return uri;
    }

    public Uri getAlbumArtUri() {
        return albumArtUri;
    }

    public String getFormattedDuration() {
        long totalSeconds = duration / 1000;
        long minutes = totalSeconds / 60;
        long seconds = totalSeconds % 60;
        return String.format("%d:%02d", minutes, seconds);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;
        return id == ((Song) o).id;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }

    @Override
    public String toString() {
        return title + " - " + artist;
    }

}
