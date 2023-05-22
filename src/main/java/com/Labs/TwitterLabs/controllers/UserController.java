package com.Labs.TwitterLabs.controllers;

import com.Labs.TwitterLabs.models.dtos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.Labs.TwitterLabs.services.implementations.UserService;

import java.net.URI;
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
    public ResponseEntity<RegisterResponseDTO> register(@RequestBody RegisterDTO registerUser) {
        if (userService.existsUserByUserName(registerUser.getUserName()) || userService.existsUserByEmail(registerUser.getEmail())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        RegisterResponseDTO registerResponseDTO = userService.register(registerUser);
        return ResponseEntity.created(URI.create("/api/v1/user-created/")).body(registerResponseDTO);
    }
    @PostMapping(value="/search")
    public ResponseEntity<List<SearchResponseDTO>> search(@RequestBody SearchDTO searchDTO) {
         List<SearchResponseDTO> list = userService.search(searchDTO);
         return ResponseEntity.ok(list);
    }

    @PostMapping(value="/follow")
    public ResponseEntity<Boolean> follow(@RequestBody FollowDTO followDTO) {
        Boolean result = userService.follow(followDTO);
        return ResponseEntity.ok(result);
    }


}
