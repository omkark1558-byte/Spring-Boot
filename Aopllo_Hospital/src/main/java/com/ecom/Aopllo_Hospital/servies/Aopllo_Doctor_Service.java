package com.ecom.Aopllo_Hospital.servies;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.Aopllo_Hospital.Dto.Doctor_Dto;
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

	public List<Doctor_Dto> getAllDoctor() {
		List<Aopllo_Doctor> list = ro.findAll();
		
	 return list.stream().map((ap)->(Doctor_Dto.convert(ap)))
			 .collect(Collectors.toList());
	}

	public void deleteDoctor(int d_id) {
		ro.deleteById(d_id);
	}

	public List<Aopllo_Doctor> getByname(String d_name) {
		return ro.getByName(d_name);
	}
}

