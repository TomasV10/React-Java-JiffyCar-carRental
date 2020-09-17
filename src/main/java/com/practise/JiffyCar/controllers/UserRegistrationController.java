package com.practise.JiffyCar.controllers;

import com.practise.JiffyCar.dtos.UserRegistrationDto;
import com.practise.JiffyCar.entities.User;
import com.practise.JiffyCar.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registration")
public class UserRegistrationController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserRegistrationDto>getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping
    public User registerUserAccount(@RequestBody UserRegistrationDto userRegistrationDto) {
       return userService.saveUser(userRegistrationDto);
    }
}
