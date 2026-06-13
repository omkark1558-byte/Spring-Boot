package com.ecom.Aopllo_Hospital.auth;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.Aopllo_Hospital.Dto.Login_DTO;
import com.ecom.Aopllo_Hospital.Dto.Register_DTO;
import com.ecom.Aopllo_Hospital.entity.User_entity;
import com.ecom.Aopllo_Hospital.repository.User_Repo;
import com.ecom.Aopllo_Hospital.security.JwtUtil;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true")
@RestController
@RequestMapping("/auth")
public class Admins_Controller {

	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private User_Repo userRepo;

	@Autowired
	private PasswordEncoder encoder;

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Login_DTO dto) {

		if ("admin".equals(dto.getUsername()) && "admin123".equals(dto.getPassword())) {

			String token = jwtUtil.generateToken(dto.getUsername());

			return ResponseEntity.ok(Map.of("token", token));

		}

		return ResponseEntity.badRequest().body("Invalid Credentials");
	}

	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody User_entity user) {

		user.setPassword(encoder.encode(user.getPassword()));

		userRepo.save(user);

		return ResponseEntity.ok("User Registered Successfully");
	}

}