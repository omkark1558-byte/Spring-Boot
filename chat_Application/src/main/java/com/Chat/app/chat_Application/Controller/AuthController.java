package com.Chat.app.chat_Application.Controller;

import com.Chat.app.chat_Application.Entity.User;
import com.Chat.app.chat_Application.Security.JwtUtil;
import com.Chat.app.chat_Application.Service.UserService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

	private final UserService userService;
	
	private final JwtUtil jwtUtil;

	public AuthController(UserService userService, JwtUtil jwtUtil) {

		this.userService = userService;
		this.jwtUtil = jwtUtil;
	}

	@PostMapping("/register")
	public User register(@RequestBody User user) {

		return userService.registerUser(user);
	}

	@PostMapping("/login")
	public String login(@RequestBody User user) {

		return jwtUtil.generateToken(user.getUsername());
	}
}