package org.com.service;

public class Transaction {

	public void transactionBegins() {
		System.out.println("transactionBegins()");
	}

	public void transactionRollback() {
		System.out.println("transactionRollback()");
	}

	public void transactionCommit() {
		System.out.println("transactionCommit()");
	}

}
