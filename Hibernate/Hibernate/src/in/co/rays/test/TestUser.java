package in.co.rays.test;

import in.co.rays.Dto.UserDto;
import in.co.rays.Model.UserModel;

public class TestUser {

	public static void main(String[] args) {

		testadd();

	}

	private static void testadd() {

		UserDto dto = new UserDto();
		UserModel model = new UserModel();

		dto.setId(1);
		dto.setFirstName("Moseen");
		dto.setLastName("khan");
		dto.setLoginId("moseen@gmail.com");
		dto.setPassword("12335");

		model.add(dto);
		System.out.println("data successfully insert");

	}
	

}
