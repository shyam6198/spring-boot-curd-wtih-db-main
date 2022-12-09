package com.enveu.example.demo.controllers;

import com.enveu.example.demo.entity.User;
import com.enveu.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class HelloController {


    @Autowired
    private UserService userService;


    @GetMapping("/sayHello") //endpoint
    public String sayHelloToUser(@RequestParam(value = "name", required = false) String name){
        if (name == null) {
            name = "User";
        }
        return "Hello "+name;
    }

    @PostMapping("/login")
    public String login(@RequestBody User user){
        boolean result = userService.login(user);
        String message = "";
        if(result){
            message = "User Authenticated Successfully";
        }else{
            message = "Invalid Credentials";
        }
        return message;
    }
	//Author Name - Shyam Kumar
}
