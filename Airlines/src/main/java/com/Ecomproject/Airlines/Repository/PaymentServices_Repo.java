package com.Ecomproject.Airlines.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ecomproject.Airlines.Entity.PaymentServices_Entity;

@Repository
public interface PaymentServices_Repo extends JpaRepository<PaymentServices_Entity, Integer>{

}
