package com.example.AlbumException.repository;

import com.example.AlbumException.model.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PhotoRepository extends MongoRepository<Photo, String> {
    //List<Photo> findAllById(String photoID);
}
