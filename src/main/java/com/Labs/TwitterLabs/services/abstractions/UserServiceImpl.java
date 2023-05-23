package com.Labs.TwitterLabs.services.abstractions;

import com.Labs.TwitterLabs.models.User;
import com.Labs.TwitterLabs.models.dtos.*;

import java.util.List;

public interface UserServiceImpl {

    RegisterResponseDTO register(RegisterDTO registerUser);
    List<SearchResponseDTO> search(SearchDTO searchDTO);
    Boolean existsUserByEmail(String email);
    Boolean existsUserByUserName(String userName);
    Boolean follow(FollowDTO followDTO);
}
