package com.Labs.TwitterLabs.services.abstractions;

import com.Labs.TwitterLabs.models.Like;

public interface ILikeService {
    void likePost(Like like, String username, int postId);
}
