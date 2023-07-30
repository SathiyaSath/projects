package EmployeeProject;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import miniproject.IPL;
import miniproject.IPLDAOImplementation;

public class EmpService2 {
	public void ViewIEmp() throws ClassNotFoundException, SQLException
	{
		List<Employee>list=new EmpDaoImplementation().findAll();
		for(Employee e:list)
		{
			System.out.println(e);
		}
		
	}
	public void insertEmp() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the eid");
		int eid=sc.nextInt();
		System.out.println("enter the ename");
		String ename=sc.next();
		System.out.println("enter the edepartment");
		String edept=sc.next();
		System.out.println("enter the eroll");
		String eroll=sc.next();
		System.out.println("enter the esalary");
		String esalary=sc.next();
		Employee e=new Employee();
		e.setEid(eid);
		new EmpDaoImplementation().insertEmp(e);
	}
	public void updateEmp() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the ename");
		String ename=sc.next();
		System.out.println("enter the edepartment");
		String edept=sc.next();
		System.out.println("enter the eroll");
		String eroll=sc.next();
		System.out.println("enter the esalary");
		String esalary=sc.next();
		System.out.println("enter the eid");
		int eid=sc.nextInt();
		Employee e=new Employee();
		e.setEname(ename);
		e.setEdept(edept);
		e.setEroll(eroll);
		e.setEid(eid);
		
	    
		new EmpDaoImplementation().UpdateEmp(e);
	}
	public void deleteEmp() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter the id");
		int eid=sc.nextInt();
		Employee e=new Employee();
	   
		e.setEid(eid);
		new EmpDaoImplementation().deleteEmp(e);
	}


}
