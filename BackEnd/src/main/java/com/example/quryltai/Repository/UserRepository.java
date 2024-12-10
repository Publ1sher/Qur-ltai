package com.example.quryltai.Repository;

import com.example.quryltai.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> getUserByUsername(String login);

    Boolean existsUserByUsername(String login);
}
