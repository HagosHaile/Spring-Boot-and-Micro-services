package com.hagos.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {
	
	//mechanism one
	//uri versioning
	@GetMapping("v1/person")
	public PersonV1 retrievePersonV1() {
		return new PersonV1("Hagos Haile");
	}
	
	@GetMapping("v2/person")
	public PersonV2 retrievePersonV2() {
		return new PersonV2(new Name("Hagos", "Haile"));
	}

	//mechanism 2=========using parameters
	//request parameter versioning
	
	@GetMapping(value="person/param", params="version=1")
	public PersonV1 paramV1() {
		return new PersonV1("Hagos Haile");
	}
	
	@GetMapping(value="person/param", params="version=2")
	public PersonV2 paramV2() {
		return new PersonV2(new Name("Hagos", "Haile"));
	}
	
	
	//mechanism 3 === using headers
	//header type versioning
	@GetMapping(value="person/header", headers="X-VERSION-HEADER=1")
	
	public PersonV1 paramHeader1() {
		return new PersonV1("Hagos Haile");
	}
	
	@GetMapping(value="person/header", headers="X-VERSION-HEADER=2")
	public PersonV2 paramHeader2() {
		return new PersonV2(new Name("Hagos", "Haile"));
	}
	
	//mechanism 4=====using produces 
	//accept header versioning or media type versioning
	
@GetMapping(value="person/produces", produces="application/and.company.app-v1+json")
	
	public PersonV1 paramProduces1() {
		return new PersonV1("Hagos Haile");
	}
	
	@GetMapping(value="person/produces", produces="application/and.company.app-v2+json")
	public PersonV2 paramProduces2() {
		return new PersonV2(new Name("Hagos", "Haile"));
	}
	

}
