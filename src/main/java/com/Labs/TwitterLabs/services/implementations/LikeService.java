package com.Labs.TwitterLabs.services.implementations;

import com.Labs.TwitterLabs.models.Like;
import com.Labs.TwitterLabs.services.abstractions.ILikeService;
import database.Database;
import org.springframework.stereotype.Service;

@Service
public class LikeService implements ILikeService {
    private Database database;
    public LikeService()
    {
        database = new Database();
    }
    @Override
    public void likePost(Like like, String username, int postId) {
        database.likePost(like,username,postId);
    }
}
