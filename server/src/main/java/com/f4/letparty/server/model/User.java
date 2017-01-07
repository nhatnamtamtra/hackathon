package com.f4.letparty.server.model;

/**
 * Created by Dang on 1/7/2017.
 */
public class User {
    private int user_id;
    private String nickname;
    private String password;

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
}
