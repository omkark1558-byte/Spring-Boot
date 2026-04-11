package com.Ecomproject.Airlines.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ecomproject.Airlines.Entity.Customer_Entity;

@Repository
public interface Customer_Repo extends JpaRepository<Customer_Entity, Integer>{

}
