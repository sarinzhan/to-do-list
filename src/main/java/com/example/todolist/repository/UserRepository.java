package com.example.todolist.repository;

import com.example.todolist.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    @Query(value = "select u from users u " +
            "where u.username = :username")
    Optional<User> getByUsername(String username);
}
