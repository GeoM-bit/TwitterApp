package com.Labs.TwitterLabs.controllers;

import com.Labs.TwitterLabs.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.Labs.TwitterLabs.services.implementations.UserService;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping(value = "/register", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean register(@RequestBody User user) {
        return userService.register(user);
    }

    @GetMapping(value="/search")
    public List<User> search(@RequestParam(required = false, defaultValue = "") String username,@RequestParam(required = false, defaultValue = "") String firstname,@RequestParam(required = false,defaultValue = "") String lastname) {
        return userService.search(username, firstname, lastname);
    }

    @PostMapping(value="/follow")
    public boolean follow(@RequestBody List<User> users) {
        return userService.follow(users.get(0), users.get(1));
    }


}
