/*
 * Copyright (c) 2019. G-Solutions, Inc.
 */

package com.gsol.springplay001.model.dto;

import com.gsol.springplay001.model.Entity.Allergen;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor
public class UserAllergens {

    private String firstName;
    private String lastName;
    private List<Allergen> allergentsList;
}
