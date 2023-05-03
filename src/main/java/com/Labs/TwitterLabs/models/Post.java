package com.Labs.TwitterLabs.models;

import java.time.LocalDateTime;
import java.util.List;

public class Post {

    private int postId;
    private String message;
    private LocalDateTime timestamp;
    private User user;

    private List<Like> likes;

    public Post(int id, String message, LocalDateTime timestamp, User user) {
        this.postId = id;
        this.message = message;
        this.timestamp = timestamp;
        this.user = user;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public User getUser() {
        return user;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void addLike(Like like){
        likes.add(like);
    }

    public int getPostId() {
        return postId;
    }
}
