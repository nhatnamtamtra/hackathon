package com.f4.letparty.server.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Created by Dang on 1/7/2017.
 */
public class User {
    private int user_id;
    private String nickname;
    private String avatar_url;
    @JsonIgnore
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
    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
