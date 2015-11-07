package com.msgcoder.entities;

import javax.persistence.*;

/**
 * Created by guanshiming on 2015/9/25.
 */
public class Play {
    private int id;
    private int artistId;
    private int artworkId;

    public Play() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "artwork_id")
    public int getArtworkId() {
        return artworkId;
    }

    public void setArtworkId(int artworkId) {
        this.artworkId = artworkId;
    }
    @Basic
    @Column(name = "artist_id")
    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    @Override
    public String toString() {
        return "Play{" +
                "id=" + id +
                ", artistId=" + artistId +
                ", artworkId=" + artworkId +
                '}';
    }
}
