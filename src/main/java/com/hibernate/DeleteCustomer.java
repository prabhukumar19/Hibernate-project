package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteCustomer {
	public static void main(String[] args) {
		System.out.println("Delete Customer from DB using Hibernate");
		
		Transaction tx = null;
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		tx = session.beginTransaction();
		Customer cs = session.get(Customer.class, 8);
		session.remove(cs);
		tx.commit();
		
		session.close();
		
		
		
	}
}
