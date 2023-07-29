package com.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.StudentDetails;
import com.utility.HibernateUtility;

public class DeleteDetails {

	public void delete() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the reservation number");
		int id_no=sc.nextInt();
		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		 StudentDetails stu = (StudentDetails)session.load(StudentDetails.class,id_no);
		session.delete(stu);
		
		  System.out.println("Deleted Successfully");
		  session.getTransaction().commit();
		     sessionFactory.close();
		     sc.close();
	}

}