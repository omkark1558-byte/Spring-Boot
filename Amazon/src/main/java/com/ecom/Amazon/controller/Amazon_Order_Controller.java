package com.ecom.Amazon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.Amazon.entity.Amazon_Order;
import com.ecom.Amazon.repository.Order_Reposotiory;

@RestController
public class Amazon_Order_Controller {

	@Autowired
	private Order_Reposotiory otr;

	@PostMapping("/add-order")
	public String addOrder(@RequestBody Amazon_Order atr) {
		otr.save(atr);
		return atr.getName_order() + " Order Add Successfully ✅";
	}

	@GetMapping("/get-order")
	public List<Amazon_Order> get() {
		return otr.findAll();
	}

	@DeleteMapping("/delete/{user_Id}")
	public String delete(@PathVariable(value = "user_Id") int user_Id) {
		otr.deleteById(user_Id);
		return "Deleted User Id ⚠️";
	}
}
