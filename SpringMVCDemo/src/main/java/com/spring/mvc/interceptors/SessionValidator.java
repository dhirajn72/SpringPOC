package com.spring.mvc.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.spring.mvc.controllers.LoginController;

public class SessionValidator extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		if (!(((HandlerMethod) handler).getBean() instanceof LoginController)) {
			if (session == null || session.getAttribute("MEMBER") == null) {
				throw new Exception("Invalid session please login");
			}
		}
		return true;
	}

}