/*
 * Copyright (c) 2019. G-Solutions, Inc.
 */

package com.gsol.springplay001.repository;

import com.gsol.springplay001.model.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {

    //User findUserAllergenList(Long userId);
    //List<User> findAllUser();
}
