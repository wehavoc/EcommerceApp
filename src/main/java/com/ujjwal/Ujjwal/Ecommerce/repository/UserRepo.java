package com.ujjwal.Ujjwal.Ecommerce.repository;

import com.ujjwal.Ujjwal.Ecommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
