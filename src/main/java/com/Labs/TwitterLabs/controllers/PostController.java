package com.Labs.TwitterLabs.controllers;

import com.Labs.TwitterLabs.models.Post;
import com.Labs.TwitterLabs.services.implementations.PostService;
import com.Labs.TwitterLabs.services.implementations.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/post")
public class PostController {

    @Autowired
    private PostService postService;

    public PostController(UserService userService) {
        this.postService = postService;
    }

    @PostMapping(value = "/{username}", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean addPost(@RequestBody Post post, @PathVariable String username) {
        return postService.addPost(username,post);
    }

    @GetMapping(value="/posts/{username}")
    public List<Post> getPosts(@PathVariable String username, @RequestParam(required = false) LocalDateTime timestamp) {
        return postService.getPosts(username, timestamp);
    }

    @GetMapping(value="/feed/{username}")
    public List<Post> getPosts(@PathVariable String username) {
        return postService.getFeed(username);
    }

}
