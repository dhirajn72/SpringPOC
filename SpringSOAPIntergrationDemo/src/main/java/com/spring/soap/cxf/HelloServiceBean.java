package com.spring.soap.cxf;

import javax.jws.WebService;

@WebService(endpointInterface = "com.spring.soap.cxf.HelloService")
public class HelloServiceBean implements HelloService {

	public String getMesage(String message) {

		return "Hi " + " message recieved: " + message;
	}

}
