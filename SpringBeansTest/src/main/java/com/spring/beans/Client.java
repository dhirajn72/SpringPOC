package com.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {

		// ApplicationContext applicationContext = new
		// ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		Test test1 = (Test) applicationContext.getBean("test");
		System.out.println(test1);
		System.out.println("Injected in test : " + test1.getA());
		System.out.println("***********");
		Test test2 = (Test) applicationContext.getBean("test");
		System.out.println(test2);
		System.out.println("Injected in test : " + test2.getA());
		System.out.println("***********");
		Test test3 = (Test) applicationContext.getBean("test");
		System.out.println(test3);
		System.out.println("Injected in test : " + test3.getA());
		System.out.println("***********");
		A a1 = (A) applicationContext.getBean("aobj");
		A a2 = (A) applicationContext.getBean("aobj");
		A a3 = (A) applicationContext.getBean("aobj");
		A a4 = (A) applicationContext.getBean("aobj");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);

	}
}
