package com.example.demo.services;

import com.example.demo.models.User;
import com.example.demo.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    //create a new user
    public void save(User user){
        userRepo.save(user);
    }

    //get all users
    public List<User> findAll(){
        return userRepo.findAll();
    }
}
