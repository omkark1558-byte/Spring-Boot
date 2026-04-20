package com.Ecomproject.Airlines.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Ecomproject.Airlines.Entity.PaymentServices_Entity;
import com.Ecomproject.Airlines.Services.Paymentservices_Services;

@RestController
public class PaymentServices_controller {

	@Autowired
	private Paymentservices_Services paymentServices;

	@PostMapping("/add-Payment")
	public String addPaymentservices(@RequestBody PaymentServices_Entity pay) {
		paymentServices.add(pay);
		return pay.getP_status() + " Payment Confirm ✅";
	}

	@GetMapping("/get-Payment")
	public List<PaymentServices_Entity> getPaymentServices() {
		return paymentServices.getAll();
	}

	@DeleteMapping("/deleted-Payment's/{p_id}")
	public String deletedPayment(@PathVariable (value="p_id")int p_id) {
		paymentServices.deleted(p_id);
		return "Deleted Payment ⚠️";
	}
}
