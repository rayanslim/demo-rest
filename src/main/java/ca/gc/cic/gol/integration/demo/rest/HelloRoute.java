package ca.gc.cic.gol.integration.demo.rest;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class HelloRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {

		restConfiguration()
			.component("{{ep.rest.component}}")
			.scheme("{{ep.rest.scheme}}")
			.host("{{ep.rest.host}}")
			.port("{{ep.rest.port}}")
	    	.bindingMode(RestBindingMode.json);
	
		rest("/api/hello")
		    .get("{name}").to("bean:hello");		
	}
}
