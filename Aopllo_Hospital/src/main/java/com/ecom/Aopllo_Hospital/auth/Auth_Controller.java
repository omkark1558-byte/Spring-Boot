package com.ecom.Aopllo_Hospital.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.Aopllo_Hospital.Dto.Login_DTO;
import com.ecom.Aopllo_Hospital.Dto.Register_DTO;
import com.ecom.Aopllo_Hospital.entity.User_entity;
import com.ecom.Aopllo_Hospital.repository.User_Repo;
import com.ecom.Aopllo_Hospital.security.JwtUtil;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/auth")
public class Auth_Controller {

	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private User_Repo userRepo;

	@Autowired
	private PasswordEncoder encoder;

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Login_DTO dto) {

		if (dto.getUsername().equals("admin") && dto.getPassword().equals("admin123")) {

			String token = jwtUtil.generateToken(dto.getUsername());

			return ResponseEntity.ok(token);
		}

		return ResponseEntity.badRequest().body("Invalid Credentials");
	}

	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody Register_DTO dto) {
		User_entity user = new User_entity();

		user.setUsername(dto.getUsername());
		user.setPassword(encoder.encode(dto.getPassword()));
		user.setRole(dto.getRole());

		userRepo.save(user);

		return ResponseEntity.ok("User Registered Successfully");
	}

}
