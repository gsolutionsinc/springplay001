/*
 * Copyright (c) 2019. G-Solutions, Inc.
 */

package com.gsol.springplay001.controller;

import com.gsol.springplay001.model.FoodAllergent;
import com.gsol.springplay001.model.User;
import com.gsol.springplay001.service.UserServiceI;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    UserServiceI userService;

    @GetMapping(path="/ping", produces = "application/json")
    public String ping() {

        log.info("--ping--");
        return new Date().toString();
    }

    @GetMapping(path="/userdetails/{userId}", produces = "application/json")
    public User userDetails(@PathVariable int userId) {

        log.info("--userDetails--");
        return userService.findUserAllergentList(userId);
    }

    @GetMapping(path = "/allusers", produces = "application/json")
    public List<User> allUsers() {

        log.info("--allUsers--");
        return userService.findAllUser();
    }

    @GetMapping(path="/userfoodallergies/{userId}", produces = "application/json")
    public List<FoodAllergent> userFoodAllergies(@PathVariable int userId) {

        log.info("--userFoodAllergies--");
        return userService.findUserAllergentList(userId).getFoodAllergentsList();
    }

}
