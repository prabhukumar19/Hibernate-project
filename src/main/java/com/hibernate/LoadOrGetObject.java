package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LoadOrGetObject {
	public static void main(String[] args) {
		System.out.println("Getting Object from DB using Hibernate");
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Customer cs = (Customer)session.get(Customer.class,1);//If Object not found in DB(Database) it will return null
		
		Customer cs2 = (Customer)session.load(Customer.class,0); // It will throw an Exception "ObjectNotFound" if Object not found in DB;
		
		
		System.out.println(cs); //We are getting result in console
		
//		System.out.println(cs2); //Throwing ObjectNotFoundException 
		
		session.close();
		
	}
}
