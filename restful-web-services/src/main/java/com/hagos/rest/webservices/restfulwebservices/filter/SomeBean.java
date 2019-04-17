package com.hagos.rest.webservices.restfulwebservices.filter;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;

/*========static filtering======
use 1 or 2 for filtering 1 at class level 2 at field level.
1. @JsonIgnoreProperties(value= {"field3", "field2"})
 OR
2. @JsonIgnore

*/
// synamic filtering is done at controller and at the bean

@JsonFilter("SomeBeanFilter") //used for dynamic binding
public class SomeBean {
	
	
	private String field1;
	private String field2;
	
	//@JsonIgnore
	private String field3;
	public SomeBean(String field1, String field2, String field3) {
		super();
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
	}
	public String getField1() {
		return field1;
	}
	public void setField1(String field1) {
		this.field1 = field1;
	}
	public String getField2() {
		return field2;
	}
	public void setField2(String field2) {
		this.field2 = field2;
	}
	public String getField3() {
		return field3;
	}
	public void setField3(String field3) {
		this.field3 = field3;
	}

}
