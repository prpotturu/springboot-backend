package com.javaguides.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaguides.springbootbackend.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
