package com.spring.mvc.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("init(FilterConfig filterConfig()");

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFilter() called");

		HttpSession session = ((HttpServletRequest) request).getSession(false);

		if (session != null && !session.isNew()) {
			chain.doFilter(request, response);
		} else {
			((HttpServletResponse) response).sendRedirect("WEB-INF/views/error.jsp");
		}
	}

	public void destroy() {
		// TODO Auto-generated method stub

	}

}
