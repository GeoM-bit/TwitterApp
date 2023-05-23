package com.Labs.TwitterLabs.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name="replies")
public class Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID reply_id;
    @JoinColumn(name = "user_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    @JoinColumn(name = "post_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Post post;
    @JoinColumn(name = "reply_id", nullable = true)
    @OneToOne(fetch = FetchType.LAZY)
    private Reply reply;
}
