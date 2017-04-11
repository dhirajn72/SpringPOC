package org.compassit.account;

import org.springframework.beans.factory.annotation.Autowired;

public class Account {
	
	@Autowired
	Employee employee;

	public String deposit(Employee employee) {

		System.out.println("deposit()");

		if (employee.getEid() == 99 && "dhiraj".equals(employee.getName())) {
			return "Hi " + employee.getName() + " you have submitted the correct id: " + employee.getEid();
		}

		return "You're not the correct user !";

	}

	public void withdraw() {
		System.out.println("withdraw()");
	}

	public void requestCheckbook() {
		System.out.println("requestCheckbook()");
	}

	public void transferFunds() {
		System.out.println("transferFunds()");

	}

	public Employee getEmployee() {
		return employee;
	}

}
