package com.Labs.TwitterLabs.services.implementations;

import com.Labs.TwitterLabs.mappers.PostMapper;
import com.Labs.TwitterLabs.models.Post;
import com.Labs.TwitterLabs.models.User;
import com.Labs.TwitterLabs.models.dtos.GetPostsDTO;
import com.Labs.TwitterLabs.models.dtos.PostDTO;
import com.Labs.TwitterLabs.models.dtos.RegisterPostDTO;
import com.Labs.TwitterLabs.repositories.PostRepository;
import com.Labs.TwitterLabs.repositories.UserRepository;
import com.Labs.TwitterLabs.services.abstractions.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService implements PostServiceImpl {

    private final UserRepository userRepository;
    private final PostRepository postRepository;
    @Autowired
    public PostService(UserRepository userRepository, PostRepository postRepository)
    {
        this.userRepository = userRepository;
        this.postRepository = postRepository;
    }
    @Override
    public RegisterPostDTO addPost(RegisterPostDTO registerPostDTO)
    {
        Optional<User> user = userRepository.findByUserName(registerPostDTO.getUserName());
        if(user.isPresent()){
            Post post = PostMapper.INSTANCE.registerPostDTOToPost(registerPostDTO);
            post.setUser(user.get());
            Post savedPost = postRepository.save(post);
            return PostMapper.INSTANCE.postToRegisterPostDTO(savedPost);

        }
        return null;
    }

    @Override
    public List<PostDTO> getPosts(GetPostsDTO getPostsDTO) {
        Optional<User> user = userRepository.findByUserName(getPostsDTO.getUserName());
        if(user.isPresent()) {
            Optional<List<Post>> posts = postRepository.findAllByUserIdAndTimestampAfter(user.get().getUser_id(), getPostsDTO.getTimestamp());
            if(posts.isPresent()) {
                List<PostDTO> list = PostMapper.INSTANCE.postListToPostDTOList(posts.get());
                return list;
            }
            return null;
        }
        return null;
    }

    @Override
    public List<Post> getFeed(String username) {
        return null;
    }
}
