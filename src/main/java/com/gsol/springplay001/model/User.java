/*
 * Copyright (c) 2019. G-Solutions, Inc.
 */

package com.gsol.springplay001.model;

import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@ToString
public class User {

    private Integer userId;

    private String firstName;
    private String lastName;

    private List<FoodAllergent> foodAllergentsList;
}
