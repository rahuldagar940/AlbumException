package com.example.AlbumException.repository;

import com.example.AlbumException.model.Album;
import org.apache.catalina.LifecycleState;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AlbumRepository extends MongoRepository<Album, String> {

    //List<Album> findAllById(String albumID);
}
