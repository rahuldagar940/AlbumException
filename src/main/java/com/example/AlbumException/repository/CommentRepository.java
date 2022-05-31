package com.example.AlbumException.repository;

import com.example.AlbumException.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CommentRepository extends MongoRepository<Comment, String> {

    //List<Comment> findAllById(String commentID);
}
