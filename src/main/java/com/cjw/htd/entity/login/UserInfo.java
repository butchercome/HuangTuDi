package com.cjw.htd.entity.login;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/6/6.
 */
public class UserInfo implements Serializable {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
