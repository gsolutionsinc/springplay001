/*
 * Copyright (c) 2019. G-Solutions, Inc.
 */

package com.gsol.springplay001.repository;

import com.gsol.springplay001.model.Entity.Allergen;
import com.gsol.springplay001.model.Entity.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserRepoTest {

    @Autowired
    private static UserRepo userRepo;

    @BeforeAll
    static void setUp() {

        Allergen egg = new Allergen(1, "egg");
        Allergen peanut = new Allergen(2, "peanut");
        Allergen almond = new Allergen(3, "almond");
        Allergen cashew = new Allergen(4, "cashew");

        // save a few of users
        userRepo.save(new User("Jan", "2019"));
        userRepo.save(new User("Feb", "2019"));
        userRepo.save(new User("Mar", "2019"));


    }

    @Test
    void sampleTest() {
        assertEquals(1,1);
    }

    @Test
    void findUserAllergenList() {
        assertEquals(1,1);
    }

    @Test
    void findAllUser() {
        assertEquals(1,1);
    }
}