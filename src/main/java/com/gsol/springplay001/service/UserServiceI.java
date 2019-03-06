/*
 * Copyright (c) 2019. G-Solutions, Inc.
 */

package com.gsol.springplay001.service;

import com.gsol.springplay001.model.User;

import java.util.List;

public interface UserServiceI {

    User findUserAllergentList(int userId);
    List<User> findAllUser();
}
