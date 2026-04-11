package com.Ecomproject.Airlines.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ecomproject.Airlines.Entity.PaymentServices_Entity;
import com.Ecomproject.Airlines.Repository.PaymentServices_Repo;

@RestController
@RequestMapping("/Payment")
public class PaymentServices_controller {

	@Autowired
	private PaymentServices_Repo payment;

	@PostMapping("/add-payment")
	public String add(@RequestBody PaymentServices_Entity pay) {
		payment.save(pay);
		return pay.getTranscation_id() + " Pay SucessFully ✅";
	}

	@GetMapping("/get-payment")
	public List<PaymentServices_Entity> getAll() {
		return payment.findAll();
	}

}
