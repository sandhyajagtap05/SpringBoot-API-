package com.example.crud.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.demo.entity.Employee;

public interface MyDao extends JpaRepository<Employee,Long>{

}
