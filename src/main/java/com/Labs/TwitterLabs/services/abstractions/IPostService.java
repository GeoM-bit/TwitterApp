package com.Labs.TwitterLabs.services.abstractions;

import com.Labs.TwitterLabs.models.Post;

import java.time.LocalDateTime;
import java.util.List;

public interface IPostService {

    boolean addPost(String username, Post post);
    List<Post> getPosts(String username, LocalDateTime timestamp);

    List<Post> getFeed(String username);
}
