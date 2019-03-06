/*
 * Copyright (c) 2019. G-Solutions, Inc.
 */

package com.gsol.springplay001.service;

import com.gsol.springplay001.model.User;
import com.gsol.springplay001.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService implements UserServiceI {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findUserAllergentList(int userId) {

        return userRepository.getUserAllegentList(userId);
    }

    @Override
    public List<User> findAllUser() {

        return userRepository.findAllUsers();
    }
}
