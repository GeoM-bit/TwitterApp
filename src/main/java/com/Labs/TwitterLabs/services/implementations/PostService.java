package com.Labs.TwitterLabs.services.implementations;

import com.Labs.TwitterLabs.models.Post;
import com.Labs.TwitterLabs.services.abstractions.IPostService;
import database.Database;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PostService implements IPostService {

    private Database database;
    public PostService()
    {
        database = new Database();
    }
    @Override
    public boolean addPost(String username, Post post) {
        return database.addPost(username,post);
    }

    @Override
    public List<Post> getPosts(String username, LocalDateTime timestamp) {
        return database.getPosts(username,timestamp);
    }

    @Override
    public List<Post> getFeed(String username) {
        return database.getFeed(username);
    }
}
