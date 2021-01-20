package com.kuzmin.security.authenticationserver.repository;

import com.kuzmin.security.authenticationserver.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findUserByUsername(String username);
}
