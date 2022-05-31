package com.example.AlbumException.resource;

import com.example.AlbumException.model.Comment;
import com.example.AlbumException.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentResource {
    @Autowired
    private CommentService commentServices;
    @PostMapping
    public Comment saveComment(@RequestBody @Valid Comment comment)
    {
        return commentServices.saveComment(comment);
    }
    @GetMapping
    public List<Comment> getAllComments()
    {
        return commentServices.getAllComments();
    }
    @GetMapping("/commentID")
    public Comment getById(@RequestParam(name = "commentID") String commentID)
    {
        return commentServices.getById(commentID);
    }
    @PutMapping
    public Comment updateComment(@RequestBody Comment comment)
    {
        return commentServices.updateComment(comment);
    }
    @DeleteMapping
    public void deleteComment(@RequestParam(name = "commentID") String commentID)
    {
        commentServices.deleteComment(commentID);
    }
}
