package com.example.demo;

import javax.persistence.Entity;
/**
 * Created by chenglinyu on 2019-04-14
 * Description:
 */
@Entity
public class User {
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String userName;
    private String password;
}