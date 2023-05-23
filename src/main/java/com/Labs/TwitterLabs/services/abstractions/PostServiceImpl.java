package com.Labs.TwitterLabs.services.abstractions;

import com.Labs.TwitterLabs.models.Post;
import com.Labs.TwitterLabs.models.dtos.GetPostsDTO;
import com.Labs.TwitterLabs.models.dtos.PostDTO;
import com.Labs.TwitterLabs.models.dtos.RegisterPostDTO;

import java.time.LocalDateTime;
import java.util.List;

public interface PostServiceImpl {

    RegisterPostDTO addPost(RegisterPostDTO registerPostDTO);
    List<PostDTO> getPosts(GetPostsDTO getPostsDTO);

    List<Post> getFeed(String username);
}
