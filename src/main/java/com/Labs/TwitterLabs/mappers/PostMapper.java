package com.Labs.TwitterLabs.mappers;

import com.Labs.TwitterLabs.models.Post;
import com.Labs.TwitterLabs.models.dtos.PostDTO;
import com.Labs.TwitterLabs.models.dtos.RegisterPostDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PostMapper {
    PostMapper INSTANCE = Mappers.getMapper(PostMapper.class);
    Post registerPostDTOToPost(RegisterPostDTO registerPostDTO);
    @Mapping(target="userName", source="user.userName")
    RegisterPostDTO postToRegisterPostDTO(Post post);
    PostDTO postToPostDTO(Post post);
    List<PostDTO> postListToPostDTOList(List<Post> posts);

}