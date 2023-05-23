package com.Labs.TwitterLabs.services.implementations;

import com.Labs.TwitterLabs.models.Like;
import com.Labs.TwitterLabs.services.abstractions.LikeServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class LikeService implements LikeServiceImpl {
    public LikeService()
    {

    }
    @Override
    public void likePost(Like like, String username, int postId) {

    }
}
