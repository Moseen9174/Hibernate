package in.co.rays.Model;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;

import in.co.rays.Dto.UserDto;
import in.co.rays.Utill.HibDataSource;

public class UserModel {

	public void add1(UserDto dto) {

		dto = new UserDto();

		dto.setId(3);
		dto.setFirstName("Deepak");
		dto.setLastName("jaat");
		dto.setLoginId("deep@gmail.com");
		dto.setPassword("42014201");

		Session session = HibDataSource.getSession();

		Transaction tx = session.beginTransaction();

		session.save(dto);

		tx.commit();

		session.close();

	}

	public void update(UserDto dto) {

		dto = new UserDto();

		dto.setId(3);
		dto.setFirstName("Deep");
		dto.setLastName("jaat");
		dto.setLoginId("deep@gmail.com");
		dto.setPassword("42014201");

		Session session = HibDataSource.getSession();

		Transaction tx = session.beginTransaction();

		session.update(dto);

		tx.commit();

		session.close();

	}

	public void delete(UserDto dto) {

		dto.setId(3);

		Session session = HibDataSource.getSession();

		Transaction tx = session.beginTransaction();

		session.update(dto);

		tx.commit();

		session.close();
	}

	public UserDto findbypk(int pk) {

		Session session = HibDataSource.getSession();

		UserDto dto = (UserDto) session.get(UserDto.class, pk);

		return dto;

	}

	public UserDto authenticate(String loginId, String password) {

		UserDto dto = null;

		Session session = HibDataSource.getSession();

		Query q = session.createQuery("from UserDto where loginId = ? and password = ?");

		q.setString(0, loginId);

		q.setString(1, password);

		List list = q.list();

		if (list.size() > 0) {

			dto = (UserDto) list.get(0);

		}

		return dto;

	}

	public List search(UserDto dto , int pageNo , int pagesize ) {

		Session session = HibDataSource.getSession();
		
		Criteria criteria =  session.createCriteria(UserDto.class);
		
		if(dto != null ) {
			
			if(dto.getFirstName() != null && dto.getFirstName().length() > 0 ) {
				criteria.add(Restrictions.eq("firstName",dto.getFirstName()));
			}
			
		}
		if(pagesize > 0) {
			pageNo=(pageNo-1)*pagesize;
			criteria.setFirstResult(pageNo);
			criteria.setMaxResults(pagesize);
			
		}
		
		List list = criteria.list();
		
		return list;

		
	}
	
	

}
