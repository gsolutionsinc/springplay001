/*
 * Copyright (c) 2019. G-Solutions, Inc.
 */

package com.gsol.springplay001.repository;

import com.gsol.springplay001.model.FoodAllergent;
import com.gsol.springplay001.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Slf4j
public class UserRepository {

    private static List<FoodAllergent> user1Allergents = new ArrayList<FoodAllergent>();
    private static List<FoodAllergent> user2Allergents = new ArrayList<FoodAllergent>();
    private static List<FoodAllergent> user3Allergents = new ArrayList<FoodAllergent>();

    private static User user1 = new User(1, "Jan", "2019", user1Allergents);
    private static User user2 = new User(1, "Feb", "2019", user2Allergents);
    private static User user3 = new User(1, "Mar", "2019", user3Allergents);

    // TODO database connectivity
    static {

        FoodAllergent egg = new FoodAllergent(new Integer(1), new String("egg"));
        FoodAllergent peanut = new FoodAllergent(new Integer(2), new String("peanut"));
        FoodAllergent almond = new FoodAllergent(new Integer(3), new String("almond"));
        FoodAllergent cashew = new FoodAllergent(new Integer(4), new String("cashew"));

        user1Allergents.add(egg);
        user1Allergents.add(peanut);

        user2Allergents.add(almond);
        user2Allergents.add(cashew);

        user3Allergents.add(egg);

        user1.setFoodAllergentsList(user1Allergents);
        user2.setFoodAllergentsList(user2Allergents);
        user3.setFoodAllergentsList(user3Allergents);
    }

    public static User getUserAllegentList(int userId) {

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
