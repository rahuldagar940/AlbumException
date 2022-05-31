package com.example.AlbumException.resource;

import com.example.AlbumException.exception.RestrictedInfoException;
import com.example.AlbumException.model.User;
import com.example.AlbumException.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/users")
public class UserResource {
    @Autowired
    private UserService userService;
    @PostMapping
    public User saveUser(@RequestBody @Valid User user)
    {
        return userService.saveUser(user);
    }
    @GetMapping
    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
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

    @GetMapping("/name")
    public List<User> getAllByName(@RequestParam(name = "name") String name) throws RestrictedInfoException {
        if(name.equalsIgnoreCase("root")){
            throw new RestrictedInfoException();
        }
        return userService.getAllByName(name);
    }


    @GetMapping("/userID")
    public User getById(@RequestParam(name = "userID") String userID)
    {
        return userService.getById(userID);
    }

}
