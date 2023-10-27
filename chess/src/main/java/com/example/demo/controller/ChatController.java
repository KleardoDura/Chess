package com.example.demo.controller;


import com.example.demo.models.Chat;
import com.example.demo.services.ChatServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {
    @Autowired
    private ChatServices chatServices;

    @PostMapping("/chat/save")
    public ResponseEntity<?> save (@RequestBody Chat chat){
        chatServices.save(chat);
        return new ResponseEntity<String>("user with the id "+chat.getUserThatWrites()+" sends to the user with Id:"+chat.getUserThatReads()+" the message: "+chat.getMessage(),HttpStatus.OK);
    }
}
