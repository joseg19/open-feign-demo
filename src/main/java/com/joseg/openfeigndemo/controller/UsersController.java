package com.joseg.openfeigndemo.controller;

import com.joseg.openfeigndemo.client.users.UsersFeignClient;
import com.joseg.openfeigndemo.client.users.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UsersController {

    @Autowired
    private UsersFeignClient usersFeignClient;

    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable long userId){
        return usersFeignClient.getUserById(userId);
    }

}
