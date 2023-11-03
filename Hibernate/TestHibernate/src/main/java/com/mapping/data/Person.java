package com.mapping.data;

public class Person {


	private int id;
	private String name;
	private String Address;
	private String phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Person(int id, String name, String address, String phone) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
		this.phone = phone;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
}
