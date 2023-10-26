package com.example.demo.controller;

import com.example.demo.models.Game;
import com.example.demo.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
    @Autowired
    private GameService gameService;

    @PutMapping("/")
    public void save(Game game){
        gameService.save(game);
    }
}
