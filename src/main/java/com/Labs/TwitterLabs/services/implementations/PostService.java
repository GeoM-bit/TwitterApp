package com.Labs.TwitterLabs.services.implementations;

import com.Labs.TwitterLabs.models.Post;
import com.Labs.TwitterLabs.services.abstractions.PostServiceImpl;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PostService implements PostServiceImpl {

    public PostService()
    {

    }
    @Override
    public boolean addPost(String username, Post post) {
        return true;
    }

    @Override
    public List<Post> getPosts(String username, LocalDateTime timestamp) {
        return null;
    }

    @Override
    public List<Post> getFeed(String username) {
        return null;
    }
}
