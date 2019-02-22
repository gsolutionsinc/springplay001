/*
 * Copyright (c) 2019. G-Solutions, Inc.
 */

package com.gsol.springplay001.model;

import lombok.Data;

import java.util.Objects;

@Data
public class FoodAllergent {

    private Integer foodAllergentId;
    private String foodAllergentName;

    public FoodAllergent(Integer foodAllergentId, String foodAllergentName) {
        this.foodAllergentId = foodAllergentId;
        this.foodAllergentName = foodAllergentName;
    }

    public Integer getFoodAllergentId() {
        return foodAllergentId;
    }

    public void setFoodAllergentId(Integer foodAllergentId) {
        this.foodAllergentId = foodAllergentId;
    }

    public String getFoodAllergentName() {
        return foodAllergentName;
    }

    public void setFoodAllergentName(String foodAllergentName) {
        this.foodAllergentName = foodAllergentName;
    }

    @Override
    public String toString() {
        return "FoodAllergent{" +
                "foodAllergentId=" + foodAllergentId +
                ", foodAllergentName='" + foodAllergentName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoodAllergent that = (FoodAllergent) o;
        return Objects.equals(foodAllergentId, that.foodAllergentId) &&
                Objects.equals(foodAllergentName, that.foodAllergentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodAllergentId, foodAllergentName);
    }
}
