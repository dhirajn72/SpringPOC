package com.spring.client;

import com.spring.soap.AccountDAO;
import com.spring.soap.AccountDAOImplService;

public class Client1 {
	public static void main(String[] args) {

		AccountDAOImplService accountDAOImplService = new AccountDAOImplService();
		AccountDAO accountDAO = accountDAOImplService.getAccountDAOImplPort();

		String message = accountDAO.deposit(9000);
		System.out.println(message);

		int ref = accountDAO.requestCheckBook("Please issue a check book");
		System.out.println(ref);

	}

}
