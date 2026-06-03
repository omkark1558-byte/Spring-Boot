package com.ecom.Aopllo_Hospital.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.Aopllo_Hospital.Dto.Login_DTO;
import com.ecom.Aopllo_Hospital.security.JwtUtil;
import org.springframework.web.bind.annotation.RequestBody;
 

@RestController
@RequestMapping("/auth")
public class Auth_Controller {

	@Autowired
	private JwtUtil jwtUtil;

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Login_DTO dto) {

		if (dto.getUsername().equals("admin") && dto.getPassword().equals("admin123")) {

			String token = jwtUtil.generateToken(dto.getUsername());

			return ResponseEntity.ok(token);
		}

		return ResponseEntity.badRequest().body("Invalid Credentials");
	}

}
