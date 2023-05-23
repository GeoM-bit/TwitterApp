package com.Labs.TwitterLabs.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID like_id;
    @JoinColumn(name = "user_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    @JoinColumn(name = "post_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Post post;

    public Like() {

    }
}
