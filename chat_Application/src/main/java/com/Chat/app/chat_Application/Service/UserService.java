package com.Chat.app.chat_Application.Service;

import com.Chat.app.chat_Application.Entity.User;
import com.Chat.app.chat_Application.Repository.UserRepository;

import jakarta.transaction.Transactional;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class UserService {

	private final UserRepository repo;

	public UserService(UserRepository repo) {
		this.repo = repo;
	}

	// Register user
	public User registerUser(User user) {

		if (repo.existsByUsername(user.getUsername())) {
			throw new RuntimeException("Username already exists");
		}

		user.setId(UUID.randomUUID().toString());
		user.setStatus("OFFLINE");

		return repo.save(user);
	}

	// Search users
	public List<User> searchUsers(String keyword) {
		return repo.searchUsers(keyword);
	}

	// Get all except current user
	public List<User> getAllUsersExcept(String userId) {
		return repo.findAllExcept(userId);
	}

	// Set ONLINE
	public void setOnline(String userId) {
		repo.updateUserStatus(userId, "ONLINE");
	}

	// Set OFFLINE
	public void setOffline(String userId) {
		repo.updateUserStatus(userId, "OFFLINE");
	}
}