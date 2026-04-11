package com.Ecomproject.Airlines.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecomproject.Airlines.Dto.Customer_DTo;
import com.Ecomproject.Airlines.Entity.Customer_Entity;
import com.Ecomproject.Airlines.Repository.Customer_Repo;

@Service
public class CustomerServices {

	@Autowired
	private Customer_Repo reop;

	public List<Customer_Entity> getCustomer() {

//		return reop.findAll().stream().map(Customer_DTo::convert).collect(Collectors.toList());
		return reop.findAll();
	}

}
