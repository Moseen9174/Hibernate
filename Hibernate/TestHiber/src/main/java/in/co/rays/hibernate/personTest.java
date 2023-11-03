package in.co.rays.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class personTest {

	public static void main(String[] args) {

		System.out.println("hello java");

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		personDTO person = new personDTO(2, "kapi", "Sharma", "989767");

		session.update(person);

		tx.commit();

		factory.close();
	}
}
