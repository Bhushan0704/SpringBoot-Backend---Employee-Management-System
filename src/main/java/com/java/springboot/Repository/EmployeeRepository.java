package com.java.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.springboot.model.Employee;

// We use JPA Repository to avoid writing the boiler plate code
@Repository
// Spring @Repository annotation is used to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects.

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
}
