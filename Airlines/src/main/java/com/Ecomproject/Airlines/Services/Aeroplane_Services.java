package com.Ecomproject.Airlines.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Ecomproject.Airlines.Entity.Aeroplane_Entity;
import com.Ecomproject.Airlines.Repository.Aeroplane_Repo;

@Service
public class Aeroplane_Services {

	@Autowired
	private Aeroplane_Repo aeroRepo;

	public String SaveAeroplane(Aeroplane_Entity aero) {

		aeroRepo.save(aero);
		return aero.getA_name() + " Added Aeroplane ✅";
	}

	public List<Aeroplane_Entity> getAeroplane() {
		return aeroRepo.findAll();
	}

	public String deleteAeroplane(int a_id) {
		aeroRepo.deleteById(a_id);
		return "Deleted ⚠️";
	}
}
