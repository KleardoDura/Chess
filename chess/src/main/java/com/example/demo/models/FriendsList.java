package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "friends_list")
public class FriendsList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "owner_id") //owner of the friends list
    private Integer ownerId;

    @Column(name = "friend_id")
    private Integer friendId;

    @Column(name ="accept_friend_request" )  //is 1 if the owner accepted the request ,if it is pending is set to 0
    private Integer acceptFriendRequest;

    public FriendsList(Integer id, Integer ownerId, Integer friendId, Integer acceptFriendRequest) {
        this.id = id;
        this.ownerId = ownerId;
        this.friendId = friendId;
        this.acceptFriendRequest = acceptFriendRequest;
    }

    public FriendsList() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getFriendId() {
        return friendId;
    }

    public void setFriendId(Integer friendId) {
        this.friendId = friendId;
    }

    public Integer getAcceptFriendRequest() {
        return acceptFriendRequest;
    }

    public void setAcceptFriendRequest(Integer acceptFriendRequest) {
        this.acceptFriendRequest = acceptFriendRequest;
    }
}
