package com.Ecomproject.Airlines.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ecomproject.Airlines.Dto.Customer_DTo;
import com.Ecomproject.Airlines.Entity.Customer_Entity;
import com.Ecomproject.Airlines.Repository.Customer_Repo;
import com.Ecomproject.Airlines.Services.CustomerServices;

@RestController
@RequestMapping("/Customer")
public class Customer_controller {

	@Autowired
	private Customer_Repo repo;

	@Autowired
	private CustomerServices services;

	@PostMapping("/add-Customers")
	public String add(@RequestBody Customer_Entity Cus) {

		repo.save(Cus);
		return Cus.getC_name() + " Customer Added SucessFully ✅";
	}

	@GetMapping("/get-Customer")
	public List<Customer_Entity> get() {
		return repo.findAll();
	}

	@DeleteMapping("/delete-Details/{c_id}")
	public String delete(@PathVariable(value = "c_id") int c_id) {
		repo.deleteById(c_id);
		return "Deleted ⚠️";
	}

	@GetMapping("/get-allCustomer/{name}/")
	public List<Customer_Entity> getAL(@PathVariable(value = "name") String name) {
		return services.getCustomer();
	
	}

}
