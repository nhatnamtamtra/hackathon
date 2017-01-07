package com.f4.letparty.server.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Dang on 1/7/2017.
 */
@Entity
public class User {
    @Id
    @Column(name="User_ID")
    private int user_id;

    @Column(name = "Nickname",nullable = true)
    private String nickname;

    @Column(name="Password")
    private String password;

    @Column(name="Avatar")
    private String avatar;
    public User(int user_id, String nickname, String password, String avatar) {
        this.user_id = user_id;
        this.nickname = nickname;
        this.password = password;
        this.avatar = avatar;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }
}
