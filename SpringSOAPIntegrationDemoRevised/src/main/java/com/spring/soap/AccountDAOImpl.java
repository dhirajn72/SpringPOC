package com.spring.soap;

import javax.jws.WebService;

@WebService(endpointInterface = "com.spring.soap.AccountDAO")
public class AccountDAOImpl implements AccountDAO {

	public String deposit(long ammount) {
		String message = "Hi, your amount " + ammount + " has been deposited into your account";
		return message;
	}

	public int requestCheckBook(String message) {
		String mesg = "Your message has been recorded in our database ::" + message + " Your reference Id is " + 101;
		System.out.println(mesg);
		return 101;
	}

}
