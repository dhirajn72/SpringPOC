package org.spring.rest.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name = "customers")
public class Customers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	List<Customer> customers = new ArrayList<Customer>();

	@XmlElement(name = "customer")
	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public void addCustomer(Customer customer) {
		this.customers.add(customer);

	}

}
