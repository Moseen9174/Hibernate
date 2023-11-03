package in.co.rays.test;

import java.util.Iterator;
import java.util.List;

import in.co.rays.Dto.UserDto;
import in.co.rays.Model.UserModel;

public class testUser {

	public static void main(String[] args) {

		// testadd();
		// testupdate();
		// testdelete();
		// testfindbypk();
		// testauthenticate();
		testsearch();
	}

	private static void testsearch() {

		UserDto dto = new UserDto();

		dto.setFirstName("Rahul");

		UserModel model = new UserModel();

		List list = model.search(null, 1, 5);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			dto = (UserDto) it.next();

			System.out.print(dto.getId());
			System.out.print("\t" + dto.getFirstName());
			System.out.print("\t" + dto.getLastName());
			System.out.print("\t" + dto.getLoginId());
			System.out.print("\t" + dto.getPassword());

		}

	}

	private static void testauthenticate() {

		UserModel model = new UserModel();

		UserDto dto = model.authenticate("Rahul@gmail.com", "42014201");

		System.out.println(dto.getId());
		System.out.println(dto.getFirstName());
		System.out.println(dto.getLastName());
		System.out.println(dto.getLoginId());
		System.out.println(dto.getPassword());

	}

	private static void testfindbypk() {

		UserModel model = new UserModel();

		UserDto dto = model.findbypk(2);

		System.out.println(dto.getId());
		System.out.println(dto.getFirstName());
		System.out.println(dto.getLastName());
		System.out.println(dto.getLoginId());
		System.out.println(dto.getPassword());

	}

	private static void testdelete() {

		UserDto dto = new UserDto();

		UserModel model = new UserModel();

		model.delete(dto);

	}

	private static void testupdate() {
		UserDto dto = new UserDto();

		UserModel model = new UserModel();

		model.update(dto);
	}

	private static void testadd() {

		UserDto dto = new UserDto();

		UserModel model = new UserModel();

		model.add1(dto);

	}

}
