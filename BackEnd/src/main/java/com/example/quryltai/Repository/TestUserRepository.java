package org.example.authonsec;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TestUserRepository extends JpaRepository<TestUser,Long> {

    Optional<User> getUserByLogin(String login);

    Boolean existsUserByLogin(String login);
}
