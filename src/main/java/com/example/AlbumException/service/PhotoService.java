package com.example.AlbumException.service;

import com.example.AlbumException.model.Photo;
import com.example.AlbumException.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {
    @Autowired
    private PhotoRepository photoRepository;

    public Photo savePhoto(Photo photo) {
        return photoRepository.save(photo);
    }

    public List<Photo> getPhotos() {
        return photoRepository.findAll();
    }

    public Photo updatePhoto(Photo photo) {
        return photoRepository.save(photo);
    }

    public void deletePhoto(String photoID) {
        photoRepository.deleteById(photoID);
    }

    public Photo getById(String photoID) {
        return photoRepository.findById(photoID).get();
    }
}
