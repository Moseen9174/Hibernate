package in.co.rays.Model;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.co.rays.Dto.UserDto;
import in.co.rays.utill.HibDataSource;

public class UserModel {

	public void add(UserDto dto) {


			Session session = HibDataSource.getSession();
			
			session.save(dto);
		
	}
}
