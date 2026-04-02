package com.ecom.Amazon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.Amazon.entity.Amazon_User;
import com.ecom.Amazon.repository.User_Repository;

@RestController
public class Amazon_User_Controller {

	@Autowired
	private User_Repository ur;

	@PostMapping("/add-user")
	public String addUser(@RequestBody Amazon_User us) {

		ur.save(us);
		return us.getUser_name() + " Saved Successfully ✅";
	}

	@GetMapping("/get-user")
	public List<Amazon_User> get() {
		return ur.findAll();
	}

	@DeleteMapping("/delete/{Id}")
	public String delete(@PathVariable(value = "Id") int Id) {
		ur.deleteById(Id);
		return "Deleted..⚠️";
	}
}
