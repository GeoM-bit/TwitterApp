package com.Labs.TwitterLabs.controllers;

import com.Labs.TwitterLabs.models.Post;
import com.Labs.TwitterLabs.models.dtos.GetPostsDTO;
import com.Labs.TwitterLabs.models.dtos.PostDTO;
import com.Labs.TwitterLabs.models.dtos.RegisterPostDTO;
import com.Labs.TwitterLabs.services.implementations.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/post")
public class PostController {

    @Autowired
    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RegisterPostDTO> addPost(@RequestBody RegisterPostDTO registerPostDTO) {
        return ResponseEntity.ok(postService.addPost(registerPostDTO));
    }

    @PostMapping(value="/posts", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<PostDTO>> getPosts(@RequestBody GetPostsDTO getPostsDTO) {
        return ResponseEntity.ok(postService.getPosts(getPostsDTO));
    }

    @GetMapping(value="/feed/{username}")
    public List<Post> getPosts(@PathVariable String username) {
        return postService.getFeed(username);
    }

}
