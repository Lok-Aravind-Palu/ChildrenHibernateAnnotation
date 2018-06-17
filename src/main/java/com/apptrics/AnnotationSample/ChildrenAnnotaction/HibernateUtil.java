package com.apptrics.AnnotationSample.ChildrenAnnotaction;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.apptrics.annotationPojo.Child;
import com.apptrics.annotationPojo.Students;

import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	public HibernateUtil(){
  	  try{
  		  
  	           @SuppressWarnings("deprecation")
				Configuration configuration =  new AnnotationConfiguration();
  	       
  	        configuration.addAnnotatedClass (Child.class);
  	        configuration.addAnnotatedClass (Students.class);

  	        configuration.setProperty("hibernate.connection.driver_class","com.mysql.jdbc.Driver");
  	        configuration.setProperty("hibernate.connection.url", "jdbc:mysql://"+"localhost"+":"+"3306"+"/sample3");   //192.168.10.168                             
  	        configuration.setProperty("hibernate.connection.username", "root");     
  	        configuration.setProperty("hibernate.connection.password", "");
  	        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
  	        configuration.setProperty("hibernate.hbm2ddl.auto", "update");
  	        configuration.setProperty("hibernate.show_sql", "true");
  	        configuration.setProperty("hibernate.connection.pool_size", "10");

  	      
  	        sessionFactory = configuration.buildSessionFactory();
      
  	        System.out.println("Session factory loaded");
    }catch (Exception e) {
          System.out.println(e.getMessage());
    }
  
	}
	 public static SessionFactory getSessionFactory() {
         return sessionFactory;
 }


	
	
}
