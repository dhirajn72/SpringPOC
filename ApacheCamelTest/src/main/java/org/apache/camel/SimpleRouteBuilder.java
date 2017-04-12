package org.apache.camel;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		//from("file:/home/dhiraj/compassites/source?noop=true").to("file:/home/dhiraj/compassites/dest");
		from("file:/home/dhiraj/compassites/source").to("file:/home/dhiraj/compassites/dest");
		}

}
