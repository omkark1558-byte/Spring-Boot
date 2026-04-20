package com.Ecomproject.Airlines.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Ecomproject.Airlines.Entity.Aeroplane_Entity;
import com.Ecomproject.Airlines.Services.Aeroplane_Services;

@RestController
public class Aeroplane_controller {

	@Autowired
	private Aeroplane_Services aeroservi;

	@PostMapping("/add-aeroplane")
	public String addAeroplane(@RequestBody Aeroplane_Entity entity) {
		aeroservi.SaveAeroplane(entity);
		return entity.getA_name() + "";
	}

	@GetMapping("/get-aeroplane")
	public List<Aeroplane_Entity> getAll() {
		return aeroservi.getAeroplane();
	}

	@DeleteMapping("/deleted-aeroplane/{a_id}")
	public String delete( @PathVariable  (value="a_id") int a_id) {
		aeroservi.deleteAeroplane(a_id);
		return "Deleted ⚠️";
	}
}
