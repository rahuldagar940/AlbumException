package com.example.AlbumException.service;

import com.example.AlbumException.model.Album;
import com.example.AlbumException.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {
    @Autowired
    private AlbumRepository albumRepository;

    public Album saveAlbum(Album album) {
        return albumRepository.save(album);
    }

    public List<Album> getAllAlbum() {
        return albumRepository.findAll();
    }

    public Album updateAlbum(Album album)
    {
        return albumRepository.save(album);
    }

    public void deleteAlbum(String albumID)
    {
        albumRepository.deleteById(albumID);
    }

    public List<Album> getByID(String albumID)
    {
        return albumRepository.findAllById(albumID);
    }
}
