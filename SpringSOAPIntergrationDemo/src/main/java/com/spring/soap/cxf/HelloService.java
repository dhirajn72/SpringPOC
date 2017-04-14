package com.spring.soap.cxf;

import javax.jws.WebService;

@WebService
public interface HelloService {

	public String getMesage(String message);

}
