package com.apptrics.AnnotationSample.ChildrenAnnotaction;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.apptrics.annotationPojo.Child;
import com.apptrics.annotationPojo.Students;



public class HibernateConfiguration {
	
	public static void insertValues(){
		
		
		try{
			
 		Session session = HibernateUtil.getSessionFactory().openSession();
		  Transaction transaction = session.beginTransaction();
		   
		  Child c = new Child();
		  Set<Students> list = new HashSet<>();
           Students s = new Students();
		  Students s1 = new Students();
		  
		  
		  list.add(s);
		  list.add(s1);
		  
		  s.setID(1);
		  s1.setID(2);
		  s.setsAddress(30022);
		  s1.setsAddress(62901);
		  s.setsDOB(15);
		  s1.setsDOB(17);
		  s.setsGender("Male");
		  s1.setsGender("Female");
		 
		  
		  c.setChildClass(2);
		  c.setcAge(5);
		  c.setcRollNo(7);
		  c.setcSection("A");
		  c.setStu(list);
		  
		   
		   session.save(c);
		   session.save(s);
		   session.save(s1);
	
		   transaction.commit();
		
		
		
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
	}
	
	
	public static void readValues(){
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		 
		Criteria createCriteria = session.createCriteria(Child.class);
		List list = createCriteria.list();
		
		list.forEach(item -> {
			System.out.println(item);
		});
		
	}

}
