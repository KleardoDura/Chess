package com.example.demo.services;

import com.example.demo.models.Game;
import com.example.demo.repos.GameRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    @Autowired
    private GameRepo gameRepo;
    public void save(Game game){
        gameRepo.save(game);
    }

}
