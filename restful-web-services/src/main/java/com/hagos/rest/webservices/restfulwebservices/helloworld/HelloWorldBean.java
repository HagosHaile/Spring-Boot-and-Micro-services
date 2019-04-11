package com.hagos.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {
	
	private String message;
	
	private int key;

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public HelloWorldBean(String message) {
		this.message = message;
		key =  23;
	}

	public void setMsg(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [msg=" + message + "]";
	}

	public String getMessage() {
		return message;
	}
	
	

}
