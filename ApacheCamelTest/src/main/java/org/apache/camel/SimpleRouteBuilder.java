package org.apache.camel;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		//from("file:/home/dhiraj/comp/source?noop=true").to("file:/home/dhiraj/comp/dest");
		from("file:/home/dhiraj/comp/source").to("file:/home/dhiraj/comp/dest");
		}

}
