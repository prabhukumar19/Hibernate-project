package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateCustomer {
	public static void main(String[] args) {
		System.out.println("Update Customer using Hibernate");
		Transaction tx=null;
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Customer.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		tx = session.beginTransaction();
		
		Customer c1 = session.get(Customer.class,2);
		System.out.println(c1);
		c1.setEmail("prabhukumar6@gmail.com");
		session.persist(c1);
		tx.commit();
		
		session.close();
		
		
	}
}
