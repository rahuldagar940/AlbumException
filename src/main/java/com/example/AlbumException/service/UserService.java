package com.example.AlbumException.service;

import com.example.AlbumException.model.User;
import com.example.AlbumException.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user)
    {
        return userRepository.save(user);
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public User updateUser(User user) {
        return userRepository.save(user);
    }
    public void deleteUser(String userID)
    {
        userRepository.deleteById(userID);
    }

    public User getById(String userID) {
        return userRepository.findById(userID).get();
    }

    public List<User> getAllByName(String name) {
        return userRepository.findAllByName(name);
    }
}
