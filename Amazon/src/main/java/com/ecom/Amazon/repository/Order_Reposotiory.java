package com.ecom.Amazon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.Amazon.entity.Amazon_Order;

@Repository
public interface Order_Reposotiory extends JpaRepository<Amazon_Order, Integer>{

}
