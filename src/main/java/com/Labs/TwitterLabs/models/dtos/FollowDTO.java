package com.Labs.TwitterLabs.models.dtos;

public class FollowDTO {
    private String followerUserName;
    private String followingUserName;

    public String getFollowerUserName() {
        return followerUserName;
    }

    public void setFollowerUserName(String followerUserName) {
        this.followerUserName = followerUserName;
    }

    public String getFollowingUserName() {
        return followingUserName;
    }

    public void setFollowingUserName(String followingUserName) {
        this.followingUserName = followingUserName;
    }
}
