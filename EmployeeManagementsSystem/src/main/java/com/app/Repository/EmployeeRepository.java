package com.app.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>{
	//Optional<Employee> findbyemailandpassword(String em,String pass);

}
