package com.enveu.example.demo.entity;

public class User {
    private String username;
    private String passowrd;
    private String userType;

    public User(String username, String passowrd, String userType) {
        this.username = username;
        this.passowrd = passowrd;
        this.userType = userType;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassowrd() {
        return passowrd;
    }

    public User setPassowrd(String passowrd) {
        this.passowrd = passowrd;
        return this;
    }

    public String getUserType() {
        return userType;
    }

    public User setUserType(String userType) {
        this.userType = userType;
        return this;
    }
}
