package com.ecom.Aopllo_Hospital.servies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.Aopllo_Hospital.entity.Aopllo_Patient;
import com.ecom.Aopllo_Hospital.repository.Patient_Repo;

@Service
public class Aopllo_Patient_Service {
	
	@Autowired
	private Patient_Repo rpo;

	public String savepatient(Aopllo_Patient Ap) {
		System.out.println(Ap.getP_id());
		rpo.save(Ap);
		return Ap.getP_name() + " Patient Added SuccessFulle ✅";
	}

	public List<Aopllo_Patient> getAllPatient() {
		return rpo.findAll();
	}

	public void delete(int p_id) {
		rpo.deleteById(p_id);
	}
	
	public List<Aopllo_Patient> getByname(String p_name)
	{
		return rpo.getByname(p_name);
	}
	
}
