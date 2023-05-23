package com.Labs.TwitterLabs.repositories;

import com.Labs.TwitterLabs.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {
    Optional<List<Post>> findAllByUserIdAndTimestampAfter(UUID userId, LocalDateTime timestamp);
}
