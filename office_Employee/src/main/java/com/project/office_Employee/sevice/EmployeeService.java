package com.project.office_Employee.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.office_Employee.enity.Employee;
import com.project.office_Employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }
    
    public void save(Employee emp) {
        repo.save(emp);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
    public Employee getById(Long id) {
        return repo.findById(id).orElse(null);
    }
}