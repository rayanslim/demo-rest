package ca.gc.cic.gol.integration.demo.rest;

import org.apache.camel.Handler;
import org.apache.camel.Header;
import org.springframework.stereotype.Component;

@Component("hello")
public class HelloResponseBuilder {

	@Handler
	public String buildResponse(@Header("name") String name) {
		
		return "Hello to you " + name + "!";
	}
}
