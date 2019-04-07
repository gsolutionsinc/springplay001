/*
 * Copyright (c) 2019. G-Solutions, Inc.
 */

package com.gsol.springplay001.repository;

import com.gsol.springplay001.model.Entity.Allergen;
import org.springframework.data.repository.CrudRepository;

public interface AllergenRepo extends CrudRepository<Allergen, Integer> {
}
