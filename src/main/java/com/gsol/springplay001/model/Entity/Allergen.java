/*
 * Copyright (c) 2019. G-Solutions, Inc.
 */

package com.gsol.springplay001.model.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity @Table(name = "Allergen")
public class Allergen {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer allergenId;
    private String allergenName;

    public Allergen(String allergenName) {
        this.allergenName = allergenName;
    }
}
