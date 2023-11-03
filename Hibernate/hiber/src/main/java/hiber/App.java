package hiber;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.Session;

public class App {

	public static void main(String[] args) {
		System.out.println("hello world");

		// SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Configuration cfg = new Configuration();
		cfg.configure("hiber/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		System.out.println(factory);

	}
}
