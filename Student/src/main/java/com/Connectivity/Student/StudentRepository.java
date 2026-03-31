package com.Connectivity.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Connectivity.Student.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
