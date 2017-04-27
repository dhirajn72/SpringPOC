package com.spring.mvc.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SessionValidator extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		System.out.println("preHandle() called");
		HttpSession session = request.getSession(false);
		System.out.println(session);

		/*if (session != null) {
			session.setMaxInactiveInterval(5);
		}*/

		if (session == null || session.isNew()) {
			// response.sendRedirect("/error.jsp");
			request.getRequestDispatcher("/error.jsp").forward(request, response);
		}
		return true;
	}

}