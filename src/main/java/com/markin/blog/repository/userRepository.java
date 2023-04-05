package com.markin.blog.repository;

import com.markin.blog.model.user;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;import java.util.Optional;

@Repository
public interface userRepository extends MongoRepository<user, String> {
    Optional<user> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

    Optional<user> findByEmail(String email);

    Optional<user> findByUsernameOrEmail(String username, String email);

}
