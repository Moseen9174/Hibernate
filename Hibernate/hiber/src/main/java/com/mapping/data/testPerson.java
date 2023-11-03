package com.mapping.data;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class testPerson {
	public static void main(String[] args) throws SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		SessionFactory factory = new Configuration().configure("hiber/hibernate.cfg.xml").buildSessionFactory();
		Session session =  factory.openSession();
		person person=new person(23,"Ram","Delhi","55434");
		Transaction tx = (Transaction) session.beginTransaction();
		session.save(person);
		tx.commit();
		session.close();
		factory.close();
	}

}
