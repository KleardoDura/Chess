package com.example.demo.services;

import com.example.demo.models.Chat;
import com.example.demo.repos.ChatRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatServices {
    @Autowired
    private ChatRepos chatRepos;

    public void save(Chat chat){
        chatRepos.save(chat);
    }
}
