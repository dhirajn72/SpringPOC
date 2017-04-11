package com.rest.spring;

import org.spring.rest.beans.Customer;
import org.spring.rest.beans.Customers;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping(value = "/rest/{sayHello}", method = RequestMethod.GET, produces = "text/plain")
	public @ResponseBody String sayHello(@PathVariable(value = "sayHello") String name) {
		System.out.println("sayHello() called !");
		return "Hi " + name + " welcome to rest world !";
	}

	@RequestMapping(value = "/getAllCustomers", produces = { "application/json" }, method = RequestMethod.GET)
	public @ResponseBody Customers getAllCustomers() {
		System.out.println("getAllCustomers() called !");
		Customers customers = new Customers();
		Customer c1 = new Customer(88, "singh", "Singh@test.com", 974385456);
		Customer c2 = new Customer(88, "singh", "Singh@test.com", 974385456);
		Customer c3 = new Customer(88, "singh", "Singh@test.com", 974385456);
		Customer c4 = new Customer(88, "singh", "Singh@test.com", 974385456);
		customers.addCustomer(c1);
		customers.addCustomer(c2);
		customers.addCustomer(c3);
		customers.addCustomer(c4);
		return customers;

	}

}
