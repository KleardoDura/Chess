package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;

    @Column(name = "game_name")
    private String gameName;

    @Column(name="user_id")
    private Integer userId;

    @Column(name="friend_id")
    private Integer friendId;

    private Integer timer;

    public Game() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getFriendId() {
        return friendId;
    }

    public void setFriendId(Integer friendId) {
        this.friendId = friendId;
    }

    public Integer getTimer() {
        return timer;
    }

    public void setTimer(Integer timer) {
        this.timer = timer;
    }

    public Game(Integer id, String gameName, Integer userId, Integer friendId, Integer timer) {
        this.id = id;
        this.gameName = gameName;
        this.userId = userId;
        this.friendId = friendId;
        this.timer = timer;
    }
}
