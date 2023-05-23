package com.Labs.TwitterLabs.controllers;

import com.Labs.TwitterLabs.models.Like;
import com.Labs.TwitterLabs.services.implementations.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/like")
public class LikeController {

    @Autowired
    private LikeService likeService;

    public LikeController(LikeService likeService) {
        this.likeService=likeService;
    }
    @PostMapping(value = "/{username}/{postID}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void addPost(@PathVariable String username, @PathVariable int postID) {
         //likeService.likePost(new Like(username), username, postID);
    }

}
