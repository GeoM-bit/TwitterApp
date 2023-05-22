package com.Labs.TwitterLabs.models.dtos;

import java.time.LocalDateTime;

public class GetPostsDTO {
    private String userName;
    private LocalDateTime timestamp;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
