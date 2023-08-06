package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import com.example.demo.dao.EmployeeRepository;
import com.example.demo.dao.DeptRepository;

@RestController
@RequestMapping("/emp")
public class EmployeeController
{
	@Autowired
	EmployeeService service;
	@Autowired
	EmployeeRepository dao;
	@GetMapping("/list")
	public ResponseEntity<List<Employee>>findAll()
	{
		return new ResponseEntity<List<Employee>>(this.service.findAll(), HttpStatus.OK);
	}
	@PostMapping("/addemp")
    public ResponseEntity<Map<String,String>> saveProduct(@RequestBody Employee e)
    {
        try
        {
            Optional<Employee> existingproduct=this.dao.findById(e.geteId());
            if(existingproduct.isEmpty())
            {
                
        
            this.service.saveemp(e);
            Map<String,String> response=new HashMap<String,String>();
            response.put("status", "success");
            response.put("message", "Employee data added!!");
            return new ResponseEntity<Map<String,String>>(response, HttpStatus.CREATED);
            }
            else
            {
                Map<String,String> response=new HashMap<String,String>();
                response.put("status", "failed");
                response.put("message", "Employee already  found!!");
                return new ResponseEntity<Map<String,String>>(response, HttpStatus.NOT_FOUND);
            }
        }
        catch(Exception e1)
        {
            Map<String,String> response=new HashMap<String,String>();
            response.put("status", "failed");
            response.put("message", "Comment not updated!!");
            return new ResponseEntity<Map<String,String>>(response, HttpStatus.BAD_REQUEST);
        }
    }
	@GetMapping("/find/{id}")
	public ResponseEntity<?> getEmployeeById(@PathVariable int id)
	{
		if(this.service.findById(id).isPresent())
		{
			return new ResponseEntity<Employee>(this.service.findById(id).get(),HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("Employee Id  not found!",HttpStatus.NOT_FOUND);
		}
	}
	@PutMapping("/update")
    public ResponseEntity<Map<String,String>> updateEmp(@RequestBody Employee e)
    {
        try
        {
            if(this.dao.findById(e.geteId()).isPresent())
            {
                Employee existingEmp=this.dao.findById(e.geteId()).get();
            existingEmp.setEname(e.getEname());
            existingEmp.setExp(e.getExp());
            existingEmp.setHiredate(e.getHiredate());
            existingEmp.setImagepath(e.getImagepath());
            existingEmp.setJobrole(e.getJobrole());
           existingEmp.setQualification(e.getQualification());
           existingEmp.setSalary(e.getSalary());

            this.service.updateemp(e);
            Map<String,String> response=new HashMap<String,String>();
            response.put("status", "success");
            response.put("message", "Employee data updated!!");
            return new ResponseEntity<Map<String,String>>(response, HttpStatus.CREATED);
            }
            else
            {
                Map<String,String> response=new HashMap<String,String>();
                response.put("status", "failed");
                response.put("message", "Employee data  not found!!");
                return new ResponseEntity<Map<String,String>>(response, HttpStatus.NOT_FOUND);
            }
        }
        catch(Exception e1)
        {
            Map<String,String> response=new HashMap<String,String>();
            response.put("status", "failed");
            response.put("message", "Employee not updated!!");
            return new ResponseEntity<Map<String,String>>(response, HttpStatus.BAD_REQUEST);
        }
    }
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Map<String,String>> deleteById(@PathVariable int id)
	{
		try
		{
			this.service.deleteById(id);
			Map<String,String> response=new HashMap<String,String>();
			response.put("status", "success");
			response.put("message", "Employee data deleted!!");
			return new ResponseEntity<Map<String,String>>(response, HttpStatus.OK);
		}
		catch(Exception e)
		{
			Map<String,String> response=new HashMap<String,String>();
			response.put("status", "failed");
			response.put("message", "Employee data not deleted!!");
			return new ResponseEntity<Map<String,String>>(response, HttpStatus.NOT_FOUND);
		}

}
	@GetMapping("/search")
public ResponseEntity<List<Employee>> getEmployeeByEname(@RequestParam("ename") String ename)
{
	//postTitle=postTitle.toLowerCase();
	return new ResponseEntity<List<Employee>>(this.service.findByEname(ename), HttpStatus.OK);
}
	@GetMapping("/emp/search/")
	public ResponseEntity<?> getEmpByEname(@RequestParam("ename") String ename)
	{
		//postTitle=postTitle.toLowerCase();
		if(this.service.getEmpByname(ename).isPresent())
		{
			return new ResponseEntity<Employee>(this.service.getEmpByname(ename).get(),HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("No Employee found!",HttpStatus.NOT_FOUND);
		}
	}
}


