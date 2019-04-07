/*
 * Copyright (c) 2019. G-Solutions, Inc.
 */

package com.gsol.springplay001.service;

import com.gsol.springplay001.model.Entity.User;
import com.gsol.springplay001.repository.UserRepositoryStatic;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService implements UserServiceI {

    @Autowired
    private UserRepositoryStatic userRepositoryStatic;

    @Override
    public User findUserAllergenList(int userId) {

        return userRepositoryStatic.getUserAllegenList(userId);
    }

    @Override
    public List<User> findAllUser() {

        return userRepositoryStatic.findAllUsers();
    }
}
