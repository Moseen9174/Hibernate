package com.mapping.data;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
       
		SessionFactory factory=new  Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Person person = new Person(23,"Moseen","indore","97857464454");
		
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		
		session.save(person);
		
		tx.commit();
		
		factory.close();
		
	}
}
