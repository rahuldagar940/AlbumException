package com.example.AlbumException.model;

import org.springframework.data.annotation.Id;

public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private String profilePicURL;

    public User(String name, String email, String profilePicURL) {
        this.name = name;
        this.email = email;
        this.profilePicURL = profilePicURL;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilePicURL() {
        return profilePicURL;
    }

    public void setProfilePicURL(String profilePicURL) {
        this.profilePicURL = profilePicURL;
    }
}
