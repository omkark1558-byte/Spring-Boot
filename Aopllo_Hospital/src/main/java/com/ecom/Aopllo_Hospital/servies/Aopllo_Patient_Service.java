package com.ecom.Aopllo_Hospital.servies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.ecom.Aopllo_Hospital.Dto.DoctorRequestDTO;
import com.ecom.Aopllo_Hospital.Dto.PatientRequestDTO;
import com.ecom.Aopllo_Hospital.Exception.ResourceNotFoundException;
import com.ecom.Aopllo_Hospital.entity.Aopllo_Doctor;
import com.ecom.Aopllo_Hospital.entity.Aopllo_Patient;
import com.ecom.Aopllo_Hospital.repository.Doctor_Repo;
import com.ecom.Aopllo_Hospital.repository.Patient_Repo;
import org.springframework.data.domain.Sort;

@Service
public class Aopllo_Patient_Service {

	@Autowired
	private Patient_Repo rpo;
	@Autowired
	private Doctor_Repo repo;

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

	public List<Aopllo_Patient> getByname(String p_name) {
		return rpo.getByname(p_name);
	}

	public List<Aopllo_Patient> searchPatient(String name) {
		return rpo.searchPatient(name);
	}

	public Page<Aopllo_Patient> getPatientPage(int page, int size) {
		return rpo.findAll(PageRequest.of(page, size));
	}

	public String updatePatient(int id, PatientRequestDTO dto) {
		Aopllo_Patient patient = rpo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Patient Not Found"));

		patient.setP_name(dto.getP_name());
		patient.setP_age(dto.getP_age());
		patient.setP_email(dto.getP_email());
		patient.setP_gender(dto.getP_gender());
		patient.setP_mobileno(dto.getP_mobileno());

		// Change Logic
		Aopllo_Doctor doctor = repo.findById(dto.getDoctorId())
				.orElseThrow(() -> new ResourceNotFoundException("Doctor Not Found"));

		patient.setDoctor(doctor);

		rpo.save(patient);

		return "Patient Updated Successfully ✅";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

//	public List<Aopllo_Patient> sortPatient(String field) {
//
//	    System.out.println("FIELD = " + field);
//
//	    return rpo.findAll(
//	        Sort.by(Sort.Direction.ASC, "p_name")
//	    );
//	}
}
