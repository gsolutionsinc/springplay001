/*
 * Copyright (c) 2019. G-Solutions, Inc.
 */

package com.gsol.springplay001.repository;

import com.gsol.springplay001.model.FoodAllergent;
import com.gsol.springplay001.model.User;
import org.springframework.stereotype.Repository;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private static List<FoodAllergent> user1Allergents = new ArrayList<FoodAllergent>();
    private static List<FoodAllergent> user2Allergents = new ArrayList<FoodAllergent>();
    private static List<FoodAllergent> user3Allergents = new ArrayList<FoodAllergent>();

    private static User user1 = new User(1, "Jan", "2019", user1Allergents);
    private static User user2 = new User(1, "Feb", "2019", user2Allergents);
    private static User user3 = new User(1, "Mar", "2019", user3Allergents);


    static {

        FoodAllergent egg = new FoodAllergent(new Integer(1), new String("egg"));
        FoodAllergent peanut = new FoodAllergent(new Integer(2), new String("peanut"));
        FoodAllergent almond = new FoodAllergent(new Integer(3), new String("almond"));
        FoodAllergent cashew = new FoodAllergent(new Integer(4), new String("cashew"));

        user1Allergents.add(new FoodAllergent(new Integer(1), new String("egg")));
        user1Allergents.add(new FoodAllergent(new Integer(2), new String("peanut")));

        user2Allergents.add(new FoodAllergent(new Integer(3), new String("almond")));
        user2Allergents.add(new FoodAllergent(new Integer(4), new String("cashew")));

        user3Allergents.add(new FoodAllergent(new Integer(1), new String("egg")));

        user1.setFoodAllergentsList(getFoodAllergentForUser(1));
        user2.setFoodAllergentsList(getFoodAllergentForUser(2));
        user3.setFoodAllergentsList(getFoodAllergentForUser(3));
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

    private static List<FoodAllergent> getFoodAllergentForUser(int userId) {

        if (userId == 1) {
            return user1Allergents;
        }
        if (userId == 2) {
            return user2Allergents;
        }
        if (userId == 3) {
            return user3Allergents;
        }

        return null;
    }

    public List<User> findAllUsers() {

        // TODO database connectivity

        return null;
    }
}
