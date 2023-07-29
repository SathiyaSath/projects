package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.entity.Details;
import com.entity.StudentDetails;
import com.utility.HibernateUtility;

public class ViewDetails {

	public void view()
	{
		SessionFactory sessionFactory1 = HibernateUtility.getSessionFactory();
		  Session session1 = sessionFactory1.openSession();
		  session1.beginTransaction();
		  
		  Query<StudentDetails> query1=session1.createQuery("from StudentDetails");
	         
	        List<StudentDetails> result=query1.list();
	         
	         
	       for(StudentDetails stu:result)
	      {
	       
	       	System.out.println(stu.toString());
	       	
	      
	         }
	       Query<Details> query2=session1.createQuery("from Details");
	         
	        List<Details> result1=query2.list();
	         
	         
	       for(Details d:result1)
	      {
	       
	       	System.out.println(d.toString());
	       	
	      
	         }
	      
		  session1.getTransaction().commit();
		  session1.close();
		  sessionFactory1.close();
		  
		  
	}

}
