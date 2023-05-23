package com.Labs.TwitterLabs.models.dtos;

import java.time.LocalDateTime;
import java.util.List;

public class PostDTO {
    private String message;
    private LocalDateTime timestamp;
    private PostUserDTO user;
    private List<LikeInPostDTO> likes;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public PostUserDTO getUser() {
        return user;
    }

    public void setUser(PostUserDTO user) {
        this.user = user;
    }

    public List<LikeInPostDTO> getLikes() {
        return likes;
    }

    public void setLikes(List<LikeInPostDTO> likes) {
        this.likes = likes;
    }
}
