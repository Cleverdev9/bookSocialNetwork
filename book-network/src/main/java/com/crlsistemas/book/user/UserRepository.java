package com.crlsistemas.book.user;

import com.crlsistemas.book.role.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Role, Integer> {
    Optional<User> findByEmail(String email);
}
