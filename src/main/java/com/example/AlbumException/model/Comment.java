package com.example.AlbumException.model;

import com.example.AlbumException.validation.CreatedByValidation;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.Min;

public class Comment {
    @Id
    private String id;
    private int photoID;
    @Min(value = 5)
    private String message;
    @CreatedByValidation
    private String createdBy;
    private String dateCreated;

    public Comment(String message, String createdBy, String dateCreated) {
        this.message = message;
        this.createdBy = createdBy;
        this.dateCreated = dateCreated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPhotoID() {
        return photoID;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}
