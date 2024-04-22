package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World! Creating Or Saving Data into DB using Hibernate!");
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();

		Customer customer = new Customer();
		customer.setName("Priti");
		customer.setEmail("priti.kumari@gmail.com");
		customer.setPhone_number(7894561230l);
		customer.setCity("Delhi");

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		System.out.println(customer);
		
		session.persist(customer);
		tx.commit();
		
		session.close();

	}
}
