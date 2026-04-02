package com.ecom.Amazon.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.Amazon.entity.Amazon_User;
import com.ecom.Amazon.repository.User_Repository;

@Service
public class User_services {

	@Autowired
	private User_Repository userRepo;

	public String saveOrder(Amazon_User user) {
		
		System.out.println(user.getUser_Id()+" ");
		userRepo.save(user);
		return user.getUser_name()+" User Added SuccessFully..✅";
	}

	public List<Amazon_User> getAlluser() {
		return userRepo.findAll();
	}

	public void deleteuser(int user_Id) {
		userRepo.deleteById(user_Id);
	}
}
