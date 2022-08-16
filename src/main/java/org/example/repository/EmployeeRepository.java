package org.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.example.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}