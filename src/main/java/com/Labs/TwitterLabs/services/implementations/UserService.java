package com.Labs.TwitterLabs.services.implementations;

import com.Labs.TwitterLabs.models.User;
import com.Labs.TwitterLabs.services.abstractions.IUserService;
import database.Database;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService implements IUserService {

    //just for testing
    private Database database;
    public UserService()
    {
        database = new Database();
    }
    @Override
    public boolean register(User user) {
        return database.addUser(user);
    }

    @Override
    public List<User> search(String userName, String firstName, String lastName) {
        return database.getUserList(userName,firstName,lastName);
    }

    @Override
    public boolean follow(User follower, User followed) {
        return database.follow(follower, followed);
    }
}
