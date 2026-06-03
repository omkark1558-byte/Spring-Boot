package com.Chat.app.chat_Application.Controller;

import com.Chat.app.chat_Application.Entity.User;
import com.Chat.app.chat_Application.Repository.UserRepository;
import com.Chat.app.chat_Application.Service.UserService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

	private final UserService service;
	private final UserRepository repo;

	public UserController(UserService service, UserRepository repo) {

		this.service = service;
		this.repo = repo;
	}

	@GetMapping("/search")
	public List<User> searchUsers(@RequestParam String keyword) {

		return service.searchUsers(keyword);
	}

	@GetMapping("/online")
	public List<User> onlineUsers() {

		return repo.getOnlineUsers();
	}

	@GetMapping("/{userId}")
	public List<User> getUsers(@PathVariable String userId) {

		return service.getAllUsersExcept(userId);
	}
}