/*
 * Copyright (c) 2019. G-Solutions, Inc.
 */

package com.gsol.springplay001.model.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity @Table(name = "User")
public class User {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
