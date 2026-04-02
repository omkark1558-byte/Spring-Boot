package com.ecom.Amazon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.Amazon.entity.Amazon_User;

@Repository
public interface User_Repository extends JpaRepository<Amazon_User, Integer>{

}
