package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.entity.Employee;


import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
@Autowired
EmployeeRepository dao;
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	
	

	@Override
	public void saveemp(Employee e) {
		dao.save(e);
		
	}



	@Override
	public Optional<Employee> findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}



	@Override
	public void updateemp(Employee e) {
		// TODO Auto-generated method stub
		dao.save(e);
	}



	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}



	@Override
	public List<Employee> findByEname(String ename) {
		// TODO Auto-generated method stub
		return this.dao.findByEnameIgnoreCase(ename);
	}



	@Override
	public Optional<Employee> getEmpByname(String ename) {
		// TODO Auto-generated method stub
		return this.dao.findEmployeeByname(ename);
	}
	

}