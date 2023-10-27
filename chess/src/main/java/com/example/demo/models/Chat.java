package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "chat")
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "user_that_writes")
    private Integer userThatWrites;

    @Column(name="user_that_reads")
    private Integer userThatReads;

    private String message;

    public Chat() {
    }

    public Chat(Integer id, Integer userThatWrites, Integer userThatReads, String message) {
        this.id = id;
        this.userThatWrites = userThatWrites;
        this.userThatReads = userThatReads;
        this.message = message;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserThatWrites() {
        return userThatWrites;
    }

    public void setUserThatWrites(Integer userThatWrites) {
        this.userThatWrites = userThatWrites;
    }

    public Integer getUserThatReads() {
        return userThatReads;
    }

    public void setUserThatReads(Integer userThatReads) {
        this.userThatReads = userThatReads;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
