package com.sample.user;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserDao service;
    public UserController(UserDao service) {
        this.service = service;
    }
     @GetMapping("/user")
    public List<User> getAllUsers() {
        return service.findAll();
    }
    @GetMapping("/user/{id}")
    public User getUsersById(@PathVariable int id) {
        return service.findById(id);
    }
}
