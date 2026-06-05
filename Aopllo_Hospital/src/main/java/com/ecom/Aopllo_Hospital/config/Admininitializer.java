package com.ecom.Aopllo_Hospital.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.ecom.Aopllo_Hospital.entity.User_entity;
import com.ecom.Aopllo_Hospital.repository.User_Repo;

@Configuration
public class Admininitializer {

	Logger log = LoggerFactory.getLogger(Admininitializer.class);
	
	@Bean
	CommandLineRunner initAdmin(User_Repo adminRepo,PasswordEncoder encoder) {
		return args -> {
			String username = "Admin";
			if(adminRepo.findByUsername(username).isEmpty()) {
				
				User_entity entity = new User_entity();
				
				entity.setUsername(username);
				entity.setPassword(encoder.encode("admin123"));
				adminRepo.save(entity);
				
				log.info("Default admin created: {} ", username);
			}
		};
	}
	
}
