package com.example.springbootvalidation.service;

import com.example.springbootvalidation.exception.UserNotFoundException;
import com.example.springbootvalidation.dto.UserRequest;
import com.example.springbootvalidation.model.User;
import com.example.springbootvalidation.repo.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {


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

    public User getUserById(Integer id) throws UserNotFoundException {

        User user = userRepo.findByUserId(id);
        if ( user != null) {
            return user;
        } else {
            throw new UserNotFoundException("user not found with id: "+id);
        }
    }

}

