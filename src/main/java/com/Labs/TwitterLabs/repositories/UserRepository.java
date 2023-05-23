package com.Labs.TwitterLabs.repositories;

import com.Labs.TwitterLabs.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByUserName(String userName);
    Optional<List<User>> findAllByLastNameOrFirstNameOrUserName(String lastName, String firstName, String userName);
    Optional<User> findByEmail(String email);
    Boolean existsUserByEmail(String email);
    Boolean existsUserByUserName(String userName);
}
