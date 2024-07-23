package com.example.crud.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.crud.demo.entity.Employee;

public interface MyService {

	List<Employee> getAll();

	//List<Employee> AddData(Employee employee);

	Employee AddData(Employee employee);

	Employee update(Employee employee);

	Optional<Employee> getOne(Long id);
	
	public void deleteOne(Long id);
	
	
	
	

}
