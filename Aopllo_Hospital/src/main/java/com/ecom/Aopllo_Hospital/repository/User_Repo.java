package com.ecom.Aopllo_Hospital.repository;

import java.util.List;
import java.util.Optional;

 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ecom.Aopllo_Hospital.entity.User_entity;



@Repository
public interface User_Repo extends JpaRepository<User_entity, Integer> {

	@Query(value = "SELECT * FROM user WHERE username = :username", nativeQuery = true)
	Optional<User_entity> findUserByUsername(@Param("username") String username);

	@Query(value = "SELECT * FROM user WHERE email = :email", nativeQuery = true)
	Optional<User_entity> findByEmail(@Param("email") String email);

	@Query(value = "SELECT * FROM user WHERE role = :role", nativeQuery = true)
	List<User_entity> findByRole(@Param("role") String role);
}
