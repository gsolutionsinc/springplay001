/*
 * Copyright (c) 2019. G-Solutions, Inc.
 */

package com.gsol.springplay001.model;

import lombok.*;

@Data
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@ToString
public class FoodAllergent {

    private Integer foodAllergentId;
    private String foodAllergentName;
}
