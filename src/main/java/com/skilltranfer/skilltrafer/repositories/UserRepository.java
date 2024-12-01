package com.skilltranfer.skilltrafer.repositories;

import com.skilltranfer.skilltrafer.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findByEmail(String email);
}
