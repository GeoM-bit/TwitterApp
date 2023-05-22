package com.Labs.TwitterLabs.mappers;

import com.Labs.TwitterLabs.models.Like;
import com.Labs.TwitterLabs.models.dtos.LikeInPostDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface LikeMapper {
    LikeMapper INSTANCE = Mappers.getMapper(LikeMapper.class);

    LikeInPostDTO likeToLikeInPostDTO(Like like);
    List<LikeInPostDTO> likesListToLikesInPostDTOList(List<Like> likes);
}
