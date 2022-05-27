package com.example.AlbumException.resource;

import com.example.AlbumException.model.User;
import com.example.AlbumException.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserResource {
    @Autowired
    private UserService userService;
    @PostMapping
    public User saveUser(@RequestBody User user)
    {
        return userService.saveUser(user);
    }
    @GetMapping
    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }
    @GetMapping("/userID")
    public List<User> getById(@RequestParam(name = "userID") String userID)
    {
        return userService.getById(userID);
    }
    @PutMapping
    public User updateUser(@RequestBody User user)
    {
        return userService.updateUser(user);
    }

    @DeleteMapping
    public void deleteUser(@RequestParam(name = "userID") String userID)
    {
        userService.deleteUser(userID);
    }
}
