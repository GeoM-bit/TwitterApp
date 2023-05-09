package com.Labs.TwitterLabs.services.abstractions;

import com.Labs.TwitterLabs.models.User;

import java.util.List;

public interface UserServiceImpl {

    boolean register(User user);
    List<User> search(String userName, String firstName, String lastName);
    boolean follow(User follower, User followed);
}
