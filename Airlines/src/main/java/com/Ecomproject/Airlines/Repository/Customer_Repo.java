package com.Ecomproject.Airlines.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Ecomproject.Airlines.Dto.Customer_DTO;
import com.Ecomproject.Airlines.Entity.Customer_Entity;

@Repository
public interface Customer_Repo extends JpaRepository<Customer_Entity, Integer> {

	
	@Query(value = "select * from customer_entity where name = : c_name;", nativeQuery = true)
	List<Customer_DTO> getFindCustomer(@Param(value="c_name") String  c_name);
}
