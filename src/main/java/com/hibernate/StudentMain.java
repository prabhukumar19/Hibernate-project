package com.hibernate;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentMain {
	public static void main(String[] args) {
		System.out.println("Student Object is creating!");
		Transaction tx = null;
		Student st = new Student();
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		tx = session.beginTransaction();
		List<String> list = new ArrayList<String>();
		st.setName("Prabhu");
		st.setCity("Delhi");

		list.add("Java");
		list.add("JavaScript");
		st.setCourses(list);
		session.persist(st);
		tx.commit();
		session.close();

	}
}
