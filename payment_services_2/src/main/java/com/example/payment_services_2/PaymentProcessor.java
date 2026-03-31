package com.example.payment_services_2;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentProcessor {

	@Autowired
//	@Qualifier("second")
	PaymentService pay;

	@GetMapping("/doo")
	public String doPayment() {
		return pay.Payment();
	}

}
