package com.ecom.Aopllo_Hospital.servies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.Aopllo_Hospital.entity.Aopllo_Doctor;
import com.ecom.Aopllo_Hospital.repository.Doctor_Repo;

@Service
public class Aopllo_Doctor_Service {

	@Autowired
	private Doctor_Repo ro;

	public String Savedoctor(Aopllo_Doctor dr) {
		System.out.println(dr.getD_id());
		ro.save(dr);
		return dr.getD_name() + " Doctor Addedd SuccessFulle ✅";
	}

	public List<Aopllo_Doctor> getAllDoctor() {
		return ro.findAll();
	}

	public void deleteDoctor(int d_id) {
		ro.deleteById(d_id);
	}
}
