package org.compassit.account;

public class Employee {

	private int eid;
	private String name;
	private String email;
	private String phone;

	public Employee(int eid, String name, String email, String phone) {
		super();
		this.eid = eid;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}

}
