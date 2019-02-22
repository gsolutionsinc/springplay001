/*
 * Copyright (c) 2019. G-Solutions, Inc.
 */

package com.gsol.springplay001.model;

import lombok.Data;

import java.util.List;
import java.util.Objects;

@Data
public class User {

    private Integer userId;

    private String firstName;
    private String lastName;

    private List<FoodAllergent> foodAllergentsList;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<FoodAllergent> getFoodAllergentsList() {
        return foodAllergentsList;
    }

    public void setFoodAllergentsList(List<FoodAllergent> foodAllergentsList) {
        this.foodAllergentsList = foodAllergentsList;
    }

    public User(Integer userId, String firstName, String lastName, List<FoodAllergent> foodAllergentsList) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.foodAllergentsList = foodAllergentsList;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", foodAllergentsList=" + foodAllergentsList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(foodAllergentsList, user.foodAllergentsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, firstName, lastName, foodAllergentsList);
    }
}
