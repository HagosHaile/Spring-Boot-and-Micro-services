package com.hagos.rest.webservices.restfulwebservices.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@Autowired
	private MessageSource messageSource;
	
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		
		return "hello world";
	}
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		
		return new HelloWorldBean("hello world");
	}

	
	@GetMapping(path = "/hello-world-bean/path/{name}")
	public HelloWorldBean helloWorldBeanPath(@PathVariable String name) {
		
		return new HelloWorldBean(String.format("hello , %s", name.toUpperCase()));
	}
	
	@GetMapping(path = "/hello-internationalization")
	//@RequestHeader(name="Accept-Language", required=false) Locale locale
	public String helloInternationalization(@RequestHeader(name="Accept-Language", required=false) Locale locale) {
		
		return messageSource.getMessage("good.morning.message", null, locale);
	}


}
