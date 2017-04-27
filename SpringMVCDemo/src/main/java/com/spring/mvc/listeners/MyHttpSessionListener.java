package com.spring.mvc.listeners;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyHttpSessionListener implements HttpSessionListener {

	public void sessionCreated(HttpSessionEvent event) {
		System.out.println("sessionCreated() called");
		event.getSession().setMaxInactiveInterval(1*60);
	}

	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("sessionDestroyed() called");
	}

}
