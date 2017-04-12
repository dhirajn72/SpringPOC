package com.apache.camel.spring;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:/home/dhiraj/compassites/source?noop=true").process(new MyProcessor())
				.to("file:/home/dhiraj/compassites/dest");
	}
}