package com.Labs.TwitterLabs.models.dtos;

import com.Labs.TwitterLabs.models.Post;
import com.Labs.TwitterLabs.models.User;

import java.util.List;

public class SearchResponseDTO {
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private List<SearchResponseListItemDTO> followers;
    private List<SearchResponseListItemDTO> following;
    private List<Post> posts;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<SearchResponseListItemDTO> getFollowers() {
        return followers;
    }

    public void setFollowers(List<SearchResponseListItemDTO> followers) {
        this.followers = followers;
    }

    public List<SearchResponseListItemDTO> getFollowing() {
        return following;
    }

    public void setFollowing(List<SearchResponseListItemDTO> following) {
        this.following = following;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
