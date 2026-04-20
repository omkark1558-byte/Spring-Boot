package com.Ecomproject.Airlines.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ecomproject.Airlines.Entity.Aeroplane_Entity;


@Repository
public interface Aeroplane_Repo extends JpaRepository<Aeroplane_Entity, Integer>{ 

	
	
}
