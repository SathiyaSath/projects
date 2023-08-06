package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Employee;

import com.example.demo.entity.Employee;

public interface EmployeeService {
	public List<Employee>findAll();
	
	public void saveemp(Employee e);
	public Optional<Employee>findById(int id);
	public void updateemp(Employee e);
	public void deleteById(int id);
	public List<Employee>findByEname(String ename);
	public Optional<Employee> getEmpByname(String ename);



}
