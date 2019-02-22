/*
 * Copyright (c) 2019. G-Solutions, Inc.
 */

package com.gsol.springplay001.controller;

import com.gsol.springplay001.model.FoodAllergent;
import com.gsol.springplay001.model.User;
import com.gsol.springplay001.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    UserServiceI userService;

    @GetMapping(path="/ping", produces = "application/json")
    public String ping() {
        return new Date().toString();
    }

    @GetMapping(path="/userDetails", produces = "application/json")
    public User userDetails(int userId) {

        return userService.findUserAllergentList(userId);
    }

    @GetMapping(path="/userFoodAllergies", produces = "application/json")
    public List<FoodAllergent> userFoodAllergies(int userId) {

        return userService.findUserAllergentList(userId).getFoodAllergentsList();
    }

}
