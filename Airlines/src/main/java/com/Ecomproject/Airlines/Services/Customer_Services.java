package com.Ecomproject.Airlines.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecomproject.Airlines.Entity.Customer_Entity;
import com.Ecomproject.Airlines.Repository.Customer_Repo;

@Service
public class Customer_Services {

	@Autowired
	private Customer_Repo repo;

	public String AddCustomer(Customer_Entity customer) {
		repo.save(customer);
		return customer.getC_name() + "Customer Added SuccessFully";

	}

	public List<Customer_Entity> getAll() {

		return repo.findAll();

	}
	
	public Optional<Customer_Entity> findById(int c_id)
	{
		return repo.findById(c_id);
	}
	
	public String delete(int c_id)
	{
		repo.deleteById(c_id);
		repo.findById(c_id);
		return "Customer Deleted ⚠️";
	}
}