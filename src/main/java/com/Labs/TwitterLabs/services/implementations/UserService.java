package com.Labs.TwitterLabs.services.implementations;

import com.Labs.TwitterLabs.mappers.UserMapper;
import com.Labs.TwitterLabs.models.User;
import com.Labs.TwitterLabs.models.dtos.*;
import com.Labs.TwitterLabs.repositories.UserRepository;
import com.Labs.TwitterLabs.services.abstractions.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService implements UserServiceImpl {

    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @Override
    public RegisterResponseDTO register(RegisterDTO registerDTO) {
        User user = UserMapper.INSTANCE.RegisterDTOtoUser(registerDTO);
        User savedUser = userRepository.save(user);
        return UserMapper.INSTANCE.userToRegisterResponseDTO(savedUser);
    }

    @Override
    public List<SearchResponseDTO> search(SearchDTO searchDTO) {
        Optional<List<User>> list = userRepository.findAllByLastNameOrFirstNameOrUserName(searchDTO.getLastName(), searchDTO.getFirstName(), searchDTO.getUserName());
        if(list.isPresent()){
            List<SearchResponseDTO> response = UserMapper.INSTANCE.userListToSearchResponseDTOList(list.get());
            return response;
        }
        return null;
    }

    @Override
    public Boolean existsUserByEmail(String email) {
        return userRepository.existsUserByEmail(email);
    }

    @Override
    public Boolean existsUserByUserName(String userName) {
        return userRepository.existsUserByUserName(userName);
    }

    @Override
    public Boolean follow(FollowDTO followDTO) {
        Optional<User> follower = userRepository.findByUserName(followDTO.getFollowerUserName());
        Optional<User> following = userRepository.findByUserName(followDTO.getFollowingUserName());
        if(follower.isPresent() && following.isPresent()){
            follower.get().addFollowing(following.get());
            following.get().addFollower(follower.get());
            userRepository.save(follower.get());
            userRepository.save(following.get());
            return true;
        }
        return false;
    }


}
