package in.co.rays.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.co.rays.Dto.UserDto;
import in.co.rays.Utill.HibDataSource;

public class testFirstLevelCache {

	public static void main(String[] args) {
		
		Session session = HibDataSource.getSession();
		
		Transaction tx = session.beginTransaction();
		
		UserDto dto1 = (UserDto) session.get(UserDto.class, 3);
		
		System.out.print(dto1.getId());
		System.out.print("\t" + dto1.getFirstName());
		System.out.print("\t" + dto1.getLastName());
		System.out.print("\t" + dto1.getLoginId());
		System.out.print("\t" + dto1.getPassword());
		
		session.evict(dto1);
		
	    UserDto dto2 = (UserDto) session.get(UserDto.class, 3);
		
		System.out.print(dto1.getId());
		System.out.print("\t" + dto2.getFirstName());
		System.out.print("\t" + dto2.getLastName());
		System.out.print("\t" + dto2.getLoginId());
		System.out.print("\t" + dto2.getPassword());
		
		tx.commit();
		
		session.close();
	}
}
