package com.codeacademy.thymeleaf_blog.repo;

import com.codeacademy.thymeleaf_blog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);

}