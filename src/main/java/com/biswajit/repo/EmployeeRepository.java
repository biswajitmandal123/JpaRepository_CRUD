package com.biswajit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biswajit.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	
	
	
}	
