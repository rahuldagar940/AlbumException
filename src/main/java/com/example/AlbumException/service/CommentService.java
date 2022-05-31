package com.example.AlbumException.service;

import com.example.AlbumException.model.Comment;
import com.example.AlbumException.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    public Comment updateComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public void deleteComment(String commentID) {
        commentRepository.deleteById(commentID);
    }

    public Comment getById(String commentID) {
        return commentRepository.findById(commentID).get();
    }
}
