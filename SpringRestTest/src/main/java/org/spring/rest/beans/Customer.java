package org.spring.rest.beans;


//@XmlRootElement(name = "customer")
public class Customer {

	private int cid;
	private String name;
	private String email;
	private long phone;

	public Customer() {
		System.out.println("Customer() - DC");
	}

	public Customer(int cid, String name, String email, long phone) {
		super();
		this.cid = cid;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	// @XmlElement
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	// @XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// @XmlElement
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// @XmlElement
	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", email=" + email
				+ ", phone=" + phone + "]";
	}

}
