package com.resmy.demos.onlineexam.service;

import com.resmy.demos.onlineexam.repository.UserRepository;
import com.resmy.demos.onlineexam.resource.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        //UserEntity createdUser = userRepository.create
        return null;
    };
}
