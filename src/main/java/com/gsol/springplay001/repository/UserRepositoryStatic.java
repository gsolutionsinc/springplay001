/*
 * Copyright (c) 2019. G-Solutions, Inc.
 */

package com.gsol.springplay001.repository;

import com.gsol.springplay001.model.Entity.Allergen;
import com.gsol.springplay001.model.Entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Slf4j
public class UserRepositoryStatic {

    private static List<Allergen> user1Allergens = new ArrayList<Allergen>();
    private static List<Allergen> user2Allergens = new ArrayList<Allergen>();
    private static List<Allergen> user3Allergens = new ArrayList<Allergen>();

    private static User user1 = new User(1L, "Jan", "2019");
    private static User user2 = new User(2L, "Feb", "2019");
    private static User user3 = new User(3L, "Mar", "2019");

    // TODO database connectivity
    static {

        Allergen egg = new Allergen(new Integer(1), new String("egg"));
        Allergen peanut = new Allergen(new Integer(2), new String("peanut"));
        Allergen almond = new Allergen(new Integer(3), new String("almond"));
        Allergen cashew = new Allergen(new Integer(4), new String("cashew"));

        /*user1Allergens.add(egg);
        user1Allergens.add(peanut);

        user2Allergens.add(almond);
        user2Allergens.add(cashew);

        user3Allergens.add(egg);

        user1.setAllergentsList(user1Allergens);
        user2.setAllergentsList(user2Allergens);
        user3.setAllergentsList(user3Allergens);*/
    }

    public static User getUserAllegenList(int userId) {

        if (userId == 1) {
            return user1;
        }
        if (userId == 2) {
            return user2;
        }
        if (userId == 3) {
            return user3;
        }
        return null;
    }

    public List<User> findAllUsers() {

        List<User> listOfAllUsers = new ArrayList<>();
        listOfAllUsers.add(user1);
        listOfAllUsers.add(user2);
        listOfAllUsers.add(user3);

        return listOfAllUsers;
    }
}
