package com.example.demo.repos;

import com.example.demo.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepo extends JpaRepository<Game,Integer> {
}
