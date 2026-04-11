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

import com.Ecomproject.Airlines.Entity.Ticket_Entity;
import com.Ecomproject.Airlines.Repository.Ticket_Repo;

@RestController
@RequestMapping("/Tickets")
public class Ticket_controller {

	
	
	@Autowired
	private Ticket_Repo ticket;
	
	@PostMapping("/add-Tickets")
	public String add(@RequestBody Ticket_Entity tick)
	{
		ticket.save(tick);
		return tick.getT_destination()+" Ticket Booked SucessFully 🛩️";	
	}
	
	@GetMapping("/get-ticket")
	public List<Ticket_Entity> getAll()
	{
		return ticket.findAll();
	}
	
	@DeleteMapping("/deleted")
	public String deleted(@PathVariable(value="t_id") int t_id)
	{
		ticket.deleteById(t_id);
		return "Ticket Deleted ⚠️";
	}
}
