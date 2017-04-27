package com.spring.mvc.controllers.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.spring.mvc.controllers.LoginController;

/**
 * @author dhiraj
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath*:WEB-INF/dispatcherServlet-servlet.xml" })
public class LoginControllerTest {

	@Autowired
	WebApplicationContext wac;

	MockMvc mockMvc;

	@Before
	public void setUp() {
		// mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");

		mockMvc = MockMvcBuilders.standaloneSetup(new LoginController()).setViewResolvers(viewResolver).build();
		System.out.println(wac);
		System.out.println(wac.getEnvironment());

	}

	@Test
	public void getHomePageTest() throws Exception {

		mockMvc.perform(get("/login")).andExpect(status().isOk()).andExpect(view().name("login"));
		// mockMvc.perform(get("/login")).andExpect(status().isOk()).andExpect(forwardedUrl("WEB-INF/views/login.jsp"));

	}

}
