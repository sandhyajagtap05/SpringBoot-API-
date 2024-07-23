package com.example.crud.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.demo.dao.MyDao;
import com.example.crud.demo.entity.Employee;

@Service
public class MyServiceImpl implements MyService {
	
	@Autowired MyDao myDao;

	@Override
	public List<Employee> getAll() {
		
		 return myDao.findAll();
		
	}

//	@Override
//	public Employee AddData(Employee employee) {
//		// TODO Auto-generated method stub
//		return myDao.save(employee);
//	}

	@Override
	public Employee AddData(Employee employee) {
		// TODO Auto-generated method stub
		return myDao.save(employee);
	}

	@Override
	public Employee update(Employee employee) {
		
		return myDao.save(employee);
	}

	@Override
	public Optional<Employee> getOne(Long id) {
		// TODO Auto-generated method stub
		return myDao.findById(id);
	}

	@Override
	public void deleteOne(Long id) {
		 myDao.deleteById(id);
		
	}

	
	
	

}
