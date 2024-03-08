package com.process.shoppingstore.controller;

import com.process.shoppingstore.model.User;
import com.process.shoppingstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("user/{id}")
    public User getUserById() {
        return userService.getUserById(1L);
    }
}
