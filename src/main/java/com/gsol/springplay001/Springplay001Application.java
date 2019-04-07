/*
 * Copyright (c) 2019. G-Solutions, Inc.
 */

package com.gsol.springplay001;

import com.gsol.springplay001.model.Entity.Allergen;
import com.gsol.springplay001.model.Entity.User;
import com.gsol.springplay001.repository.AllergenRepo;
import com.gsol.springplay001.repository.UserRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class Springplay001Application {

	public static void main(String[] args) {
		SpringApplication.run(Springplay001Application.class, args);
	}

	@Bean
	ApplicationRunner init(UserRepo userRepo, AllergenRepo allergenRepo) {
		return (args) -> {

			// save a few of users
			userRepo.save(new User("Jan", "2019"));
			userRepo.save(new User("Feb", "2019"));
			userRepo.save(new User("Mar", "2019"));

			allergenRepo.save(new Allergen("egg"));
			allergenRepo.save(new Allergen("peanut"));
			allergenRepo.save(new Allergen("almond"));
			allergenRepo.save(new Allergen("cashew"));


			// fetch all users
			log.info("Users found with findAll():");
			log.info("-------------------------------");
			for (User user : userRepo.findAll()) {
				log.info(user.toString());
			}
			log.info("");

			// fetch an individual user by ID
			userRepo.findById(1L)
					.ifPresent(customer -> {
						log.info("User found with findById(1L):");
						log.info("--------------------------------");
						log.info(customer.toString());
						log.info("");
					});

			// fetch all allergens
			log.info("Allergens found with findAll():");
			log.info("-------------------------------");
			for (Allergen allergen : allergenRepo.findAll()) {
				log.info(allergen.toString());
			}
			log.info("");

			// fetch an individual allergen by ID
			allergenRepo.findById(4)
					.ifPresent(allergen -> {
						log.info("Allergen found with findById(1L):");
						log.info("--------------------------------");
						log.info(allergen.toString());
						log.info("");
					});
		};
	}

}

