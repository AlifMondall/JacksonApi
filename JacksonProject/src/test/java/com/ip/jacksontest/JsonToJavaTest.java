package com.ip.jacksontest;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.ip.jackson.JsonToJava;
import com.ip.model.Employee;



public class JsonToJavaTest {

	//@Test
	public void convertJsonToJava() throws JsonParseException, JsonMappingException, IOException {
		
		String str = "C:\\Users\\Abu Mondal\\eclipse-workspace\\JacksonProject\\Myjson.json";
		
		List list = JsonToJava.convertJava(str);
		Employee emp = (Employee)list.get(0);
		
		Assert.assertEquals(emp.getFirstname(), "Abu");
		//Assert.assertEquals(emp.getLastname()), "");
				
	}
	
	@Test
	public void passingNull() throws JsonParseException, JsonMappingException, IOException {
		String str = "C:\\Users\\Abu Mondal\\eclipse-workspace\\JacksonProject\\Myjson.json";
		List list = JsonToJava.convertJava(str);
		Assert.assertEquals(list.get(0), null);
		
	}
}
