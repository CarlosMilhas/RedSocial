package com.milhas.RedSocial.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.milhas.RedSocial.model.User;
import com.milhas.RedSocial.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")

public class UserController {

    private final UserService myService;

    @PostMapping()
    public void createUser(@RequestBody User user) {

        myService.createUser(user);

    }

    @GetMapping()
    public List<User> getAllUsers() {
        return myService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable long id) {

        return myService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable long id) {
        myService.deleteById(id);
    }

}
