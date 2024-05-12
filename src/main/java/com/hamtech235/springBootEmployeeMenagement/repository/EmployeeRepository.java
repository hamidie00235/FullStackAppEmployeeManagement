package com.hamtech235.springBootEmployeeMenagement.repository;

import com.hamtech235.springBootEmployeeMenagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
