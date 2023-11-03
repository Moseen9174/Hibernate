package in.co.rays.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.co.rays.Dto.UserDto;
import in.co.rays.Utill.HibDataSource;

public class testQueryChache {
	
	public static void main(String[] args) {

	    Session session =  HibDataSource.getSession();

		Transaction tx = session.beginTransaction();

		Query q1 = session.createQuery("from UserDTo where id = 3");

		q1.setCacheable(true);

		List list1 = q1.list();

		Iterator it1 = list1.iterator();

		while (it1.hasNext()) {

			UserDto dto1 = (UserDto) it1.next();

			System.out.print(dto1.getId());
			System.out.print("\t" + dto1.getFirstName());
			System.out.print("\t" + dto1.getLastName());
			System.out.print("\t" + dto1.getLoginId());
			System.out.print("\t" + dto1.getPassword());
			

		}

		Query q2 = session.createQuery("from UserDTo where id = 3");

		q2.setCacheable(true);

		// q2.setCacheMode(CacheMode.REFRESH);

		List list2 = q2.list();

		Iterator it2 = list2.iterator();

		while (it2.hasNext()) {

			UserDto dto2 = (UserDto) it2.next();

			System.out.print(dto2.getId());
			System.out.print("\t" + dto2.getFirstName());
			System.out.print("\t" + dto2.getLastName());
			System.out.print("\t" + dto2.getLoginId());
			System.out.print("\t" + dto2.getPassword());
		
		}
		tx.commit();
		session.close();

	}


}
