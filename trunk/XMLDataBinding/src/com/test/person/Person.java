package com.test.person;

public class Person {
	private String name;
	private String address;
	private String ssn;
	private String email;
	private String homePhone;
	private String workPhone;

	public Person(String name, String address, String ssn, String email,
	              String homePhone, String workPhone) {
		this.name = name;
		this.address = address;
		this.ssn = ssn;
		this.email = email;
		this.homePhone = homePhone;
		this.workPhone = workPhone;
	}

	public Person() { }

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getSsn() {
		return ssn;
	}

	public String getEmail() {
			return email;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public String getWorkPhone() {
			return workPhone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

}