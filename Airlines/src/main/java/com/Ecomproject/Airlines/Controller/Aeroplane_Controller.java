package com.Ecomproject.Airlines.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ecomproject.Airlines.Entity.Aeroplane_Entity;
import com.Ecomproject.Airlines.Repository.Aeroplane_Repo;

@RestController
@RequestMapping("/Aeroplanes")
public class Aeroplane_Controller {

	
	
	@Autowired
	private Aeroplane_Repo repo;
	
	
	@PostMapping("/add-Aeroplane")
	public String add(@RequestBody Aeroplane_Entity aero)
	{
		repo.save(aero);
		return aero.getA_name()+" Aeroplane Added ✅";
	}
	
	@GetMapping("/get-Airlines")
	public List<Aeroplane_Entity> getAll()
	{
		return repo.findAll();
	}
	
	@DeleteMapping("/delete/{a_id}")
	public String delete(@PathVariable (value="a_id") long a_id)
	{
		repo.deleteById((int) a_id);
		return "Deleted ⚠️";
	}
	
	
}
