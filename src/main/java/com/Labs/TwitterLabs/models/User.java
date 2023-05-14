package com.Labs.TwitterLabs.models;

import java.util.List;

public class User {
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private List<User> followers;
    private List<User> following;

    private List<Post> posts;

    public User(String userName, String firstName, String lastName, String email, String password) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }
    public void addFollower(User follower) {
        this.followers.add(follower);
    }

    public void addFollowing(User following) {
        this.followers.add(following);
    }

    public void setFollowing(List<User> following) {
        this.following = following;
    }

    public String getUsername() {
        return userName;
    }

    public String getFirstname() {
        return firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public List<User> getFollowing() {
        return following;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void addPost(Post post)
    {
        posts.add(post);
    }
}
