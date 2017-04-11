package com.spring.beans;

public class Test {
	private A a;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
		System.out.println("setA(A a) called");
	}

	public Test() {
		System.out.println("Test() called");
	}

}
