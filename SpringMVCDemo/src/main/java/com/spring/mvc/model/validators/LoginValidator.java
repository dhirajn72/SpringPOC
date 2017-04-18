package com.spring.mvc.model.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.spring.mvc.commands.LoginCommand;

public class LoginValidator implements Validator {

	public boolean supports(Class<?> arg0) {
		return arg0.equals(LoginCommand.class);
	}

	public void validate(Object command, Errors errors) {
		LoginCommand loginCommand = (LoginCommand) command;
		String username = loginCommand.getUsername();
		String password = loginCommand.getPassword();

		System.out.println("validateLogin() called");
		System.out.println("username :" + username + "password :" + password);

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "username.required", "Name is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "password.required", "Password is required.");

	}
}
