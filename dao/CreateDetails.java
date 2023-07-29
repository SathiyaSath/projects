package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Details;
import com.entity.StudentDetails;
import com.utility.HibernateUtility;

public class CreateDetails {
	public  void create()
	{
		  SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  StudentDetails stu=new StudentDetails("Sathiya","CSE",2022,"A1+","TRICHY");
		  
		  
		  Details d1=new Details();
		
		  d1.setFee_Paid_Info("yes");
		  d1.setAttentance_percentage(80);
		  d1.setGCPA_Details(70);
		  
		  
 StudentDetails stu1=new StudentDetails("Aravinth","CSE",2023,"B+","THANJAVUR");
	  Details d2=new Details();
		 
		
		  d2.setFee_Paid_Info("yes");
		  d2.setAttentance_percentage(70);
		  d2.setGCPA_Details(80);
		  
		  
 StudentDetails stu2=new StudentDetails("Kiruba","Civil",2020,"B1+","NAMAKKKAL");
	  Details d3=new Details();
		 
		
		  d3.setFee_Paid_Info("yes");
		  d3.setAttentance_percentage(70);
		  d3.setGCPA_Details(80);
		  
		  stu.setDetails(d1);
		  session.save(stu);
		  session.save(d1);
		  
		  stu1.setDetails(d2);
		  session.save(stu1);
		  session.save(d2);
		  
		  stu1.setDetails(d3);
		  session.save(stu2);
		  session.save(d3);
		  
		  System.out.println("Inserted Successfully");
		  session.getTransaction().commit();
		  session.close();
		  sessionFactory.close();

	}
	
}
