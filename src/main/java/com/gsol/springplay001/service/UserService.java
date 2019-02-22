/*
 * Copyright (c) 2019. G-Solutions, Inc.
 */

package com.gsol.springplay001.service;

import com.gsol.springplay001.model.FoodAllergent;
import com.gsol.springplay001.model.User;
import com.gsol.springplay001.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServiceI {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findUserAllergentList(int userId) {

        return userRepository.getUserAllegentList(userId);
    }
}
