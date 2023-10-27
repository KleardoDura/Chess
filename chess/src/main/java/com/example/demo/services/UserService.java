package com.example.demo.services;

import com.example.demo.models.User;
import com.example.demo.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    //create a new user
    public void save(User user){

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepo.save(user);
    }

    //get all users
    public List<User> findAll(){
        return userRepo.findAll();
    }
}
