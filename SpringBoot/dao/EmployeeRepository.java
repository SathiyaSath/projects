package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
	List<Employee> findByEnameIgnoreCase(String ename);
	@Query(value = "SELECT * FROM Employee p WHERE p.ename = ?1",nativeQuery = true  )
	public Optional<Employee> findEmployeeByname(String title);
}
