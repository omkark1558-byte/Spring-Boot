package com.Ecomproject.Airlines.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecomproject.Airlines.Entity.PaymentServices_Entity;
import com.Ecomproject.Airlines.Repository.PaymentService_Repo;

@Service
public class Paymentservices_Services {

	@Autowired
	private PaymentService_Repo repo;

	public String add(PaymentServices_Entity pay) {
		repo.save(pay);
		return pay.getP_status() + " Payament SucessFully";
	}

	public List<PaymentServices_Entity> getAll() {
		return repo.findAll();
	}

	public String deleted(int p_id) {
		repo.deleteById(p_id);
		return "Deleted ⚠️";
	}
}
