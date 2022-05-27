package com.example.AlbumException.model;

import org.springframework.data.annotation.Id;

public class Album
{
    @Id
    private String id;
    private String name;
    private String coverPhotoURL;
    private String creatredBy;
    private String dateCreated;

    public Album(String name, String coverPhotoURL, String creatredBy, String dateCreated) {
        this.name = name;
        this.coverPhotoURL = coverPhotoURL;
        this.creatredBy = creatredBy;
        this.dateCreated = dateCreated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoverPhotoURL() {
        return coverPhotoURL;
    }

    public void setCoverPhotoURL(String coverPhotoURL) {
        this.coverPhotoURL = coverPhotoURL;
    }

    public String getCreatredBy() {
        return creatredBy;
    }

    public void setCreatredBy(String creatredBy) {
        this.creatredBy = creatredBy;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}
