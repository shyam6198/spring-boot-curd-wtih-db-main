package com.enveu.example.demo.service;

import com.enveu.example.demo.entity.User;
import org.springframework.stereotype.Service;
//Author Name - Shyam Kumar
@Service
public class UserService {

    public boolean login(User user){
        return user.getUsername().equals("Talib") && user.getPassowrd().equals("12345");
    }
}
