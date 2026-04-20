package com.Ecomproject.Airlines.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Ecomproject.Airlines.Entity.Ticket_Entity;
import com.Ecomproject.Airlines.Services.Ticket_Services;

@RestController
public class Ticket_controller {

	@Autowired
	private Ticket_Services ticket;

	@PostMapping("/add-Tickets")
	public String addTickets(@RequestBody Ticket_Entity tick) {
		ticket.add(tick);
		return tick.getT_name() + " Ticket Confirm";
	}

	@GetMapping("/get-Tickets")
	public List<Ticket_Entity> getTickets() {
		return ticket.getAll();
	}

	@DeleteMapping("/deleted-Tickets")
	public String deletedTickets(@PathVariable (value="t_id") int t_id) {
		ticket.delete(t_id);
		return "Deleted Ticket ⚠️";
	}
}
