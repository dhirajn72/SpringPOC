package com.spring.mvc.controllers;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.mvc.commands.LoginCommand;
import com.spring.mvc.model.validators.LoginValidator;

@Controller
@SessionAttributes("loginCommand")
public class LoginController {

	@Autowired
	LoginValidator loginValidator;

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getHomePage(Map model, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("getHomePage() called");
		LoginCommand command = new LoginCommand();
		model.put("loginCommand", command);
		request.setAttribute("model", model);

		/*if (request.getSession(false) == null) {
			return "error";
		}*/

		return "login";
	}

	@RequestMapping(value = "/loginSubmit", method = RequestMethod.POST)
	public String loginSubmit(@ModelAttribute("loginCommand") LoginCommand loginCommand, BindingResult errors) {
		System.out.println("loginSubmit() called");
		loginValidator.validate(loginCommand, errors);

		if (errors.hasErrors()) {
			return "login";
		}

		String username = loginCommand.getUsername();
		String password = loginCommand.getPassword();
		System.out.println("Username: " + username + " Password :" + password);

		return "home";

	}

}
