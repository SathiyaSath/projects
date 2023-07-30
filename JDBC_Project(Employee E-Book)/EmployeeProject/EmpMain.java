package EmployeeProject;

import java.sql.SQLException;
import java.util.Scanner;

import miniproject.IPLService;

public class EmpMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("EMPLOYEE DETAILS SYSTEM");
		System.out.println("1. VIEW");
		System.out.println("2. ADD ");
		System.out.println("3. Update ");
		System.out.println("4. Delete ");
		System.out.println("5. Exit");
		do
		{
			System.out.println("enter the choice");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					new EmpService2().ViewIEmp();
					break;
				case 2:
					new EmpService2().insertEmp();
					break;
				case 3:
					new EmpService2().updateEmp();
					break;
				case 4:
					new EmpService2().deleteEmp();
					break;
					
			}
			System.out.println("do you want to continue");
		 s=sc.next();
			
		}
		while(s.equals("yes"));
		

	}

}
