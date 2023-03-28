package com.example.springbootvalidation.repo;


import com.example.springbootvalidation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUserId(Integer id);
}
