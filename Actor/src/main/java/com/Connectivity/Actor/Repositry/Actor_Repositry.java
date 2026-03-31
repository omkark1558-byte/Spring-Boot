package com.Connectivity.Actor.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Connectivity.Actor.Entity.Actor;

@Repository
public interface Actor_Repositry extends JpaRepository<Actor, Integer>{

}
