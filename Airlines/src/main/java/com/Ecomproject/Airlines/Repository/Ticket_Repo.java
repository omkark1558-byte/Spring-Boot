package com.Ecomproject.Airlines.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ecomproject.Airlines.Entity.Ticket_Entity;

@Repository
public interface Ticket_Repo extends JpaRepository<Ticket_Entity, Integer> {

}
