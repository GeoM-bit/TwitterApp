package com.Labs.TwitterLabs.models.dtos;

import java.time.LocalDateTime;

public class RegisterPostDTO {
    private String message;
    private LocalDateTime timestamp;
    private String userName;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
