package org.com.clients;

import org.com.account.Account;
import org.com.account.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Account account = (Account) context.getBean("account");

		Employee employee = new Employee(99, "dhiraj", "dhiraj@compass", "987567798");

		String message = account.deposit(employee);
		System.out.println(message);

	}

}
