package com.Ecomproject.Airlines.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecomproject.Airlines.Entity.Ticket_Entity;
import com.Ecomproject.Airlines.Repository.Ticket_Repo;

@Service
public class Ticket_Services {

	@Autowired
	private Ticket_Repo tickets;

	public String add(Ticket_Entity tick) {
		tickets.save(tick);
		return tick.getT_id() + " Ticket Confim ✅";
	}

	public List<Ticket_Entity> getAll() {
		return tickets.findAll();
	}

	public String delete(int t_id) {
		tickets.deleteById(t_id);
		return "Deleted ⚠️";
	}

}
