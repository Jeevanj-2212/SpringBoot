package com.sample.user;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    private UserDao service;

    public UserController(UserDao service) {
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable int id) {
        User user = service.findById(id);
        if(user == null){
            throw new UserNotFoundException("id "+id);
        }
        return user;
    }
    @DeleteMapping("/users/{id}")
    public void  deleteUserById(@PathVariable int id) {
         service.deleteById(id);

    }


    @PostMapping("/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {

        //In order to get the location of the user after saving we are using URI so in response we will get Location
        //http://localhost:8080/users/4 like this
         User savedUser = service.save(user);
         URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
         return ResponseEntity.created(uri).build();
    }

    @GetMapping("/helloWorld-i18n")
    public  String helloWorldInternationalisation(){
        return "Hello World";
    }
}