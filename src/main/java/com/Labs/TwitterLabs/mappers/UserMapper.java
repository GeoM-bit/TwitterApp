package com.Labs.TwitterLabs.mappers;

import com.Labs.TwitterLabs.models.User;
import com.Labs.TwitterLabs.models.dtos.*;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    User RegisterDTOtoUser(RegisterDTO registerDTO);
    RegisterResponseDTO userToRegisterResponseDTO(User user);
    SearchResponseDTO userToSearchResponseDTO(User user);
    SearchResponseListItemDTO userToSearchResponseListItemDTO(User user);
    List<SearchResponseDTO> userListToSearchResponseDTOList(List<User> users);
    PostUserDTO userToPostUserDTO(User user);
    LikeUserDTO userToLikeUser(User user);
}
