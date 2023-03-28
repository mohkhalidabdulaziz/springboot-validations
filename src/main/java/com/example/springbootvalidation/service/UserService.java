package com.example.springbootvalidation.service;

import com.example.springbootvalidation.dto.UserRequest;
import com.example.springbootvalidation.model.User;
import com.example.springbootvalidation.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired

    private UserRepo userRepo;

    public User saveUser(UserRequest request) {
        User user = User.
                build(0, request.getName(),
                        request.getEmail(),
                        request.getMobile(),
                        request.getGender(),
                        request.getAge(),
                        request.getNationality());
        return userRepo.save(user);
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public User getUserById(Integer id) {
        return userRepo.findByUserId(id);
    }

}

