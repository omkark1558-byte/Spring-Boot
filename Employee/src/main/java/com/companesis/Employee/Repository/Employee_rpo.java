package com.companesis.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.companesis.Employee.Entity.Employee;


@Repository
public interface Employee_rpo  extends JpaRepository<Employee, Integer> {

	
}
