package com.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.StudentDetails;
import com.utility.HibernateUtility;

public class UpdateDetails {

	public void update()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the reservation number");
		int id_no=sc.nextInt();
		
		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();	
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		 
		  StudentDetails stu = (StudentDetails)session.get(StudentDetails.class,id_no);
		  stu.setName("Sathiya S");
		  
		  System.out.println("Updated Successfully");
		  session.getTransaction().commit();
		  sessionFactory.close();
		  sc.close();
	}

}