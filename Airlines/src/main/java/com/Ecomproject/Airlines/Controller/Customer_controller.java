package com.Ecomproject.Airlines.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Ecomproject.Airlines.Entity.Customer_Entity;
import com.Ecomproject.Airlines.Exception.CustomerNotFoundException;
import com.Ecomproject.Airlines.Services.Customer_Services;

@RestController
public class Customer_controller {

	@Autowired
	private Customer_Services cusservices;

	@PostMapping("/add-Customer")
	public String addCustomer(@RequestBody Customer_Entity customer) {
		cusservices.AddCustomer(customer);
		return customer.getC_name() + " Customer Added SucessFully ✅";
	}

	@GetMapping("/get-Customer")
	public List<Customer_Entity> getCustomer() {
		return cusservices.getAll();
	}

	@DeleteMapping("/delete-Customer/{c_id}")
	public String deleteCustmoer(@PathVariable (value="c_id") int c_id) throws CustomerNotFoundException {
		
		Optional<Customer_Entity> cus = cusservices.findById(c_id);
		
		if(! cus.isPresent())
		{
			throw new CustomerNotFoundException(c_id);
		}
		cusservices.delete(c_id);
		return "Deleted ⚠️";
	}

	
//	@ExceptionHandler(CustomerNotFoundException.class)
//	public String customerhandler(CustomerNotFoundException ex)
//	{
//		return "Customer is Not Found !" + ex.getMessage();
//	}
	
	
}
