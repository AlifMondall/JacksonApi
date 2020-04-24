package com.ip.jacksontest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ip.jackson.JavaToJson;
import com.ip.model.Employee;

public class JavaToJsonTest {

	// @Test
	public void convertJavaToJson() throws JsonProcessingException {
		Employee em = new Employee();

		em.setFirstname("Abu");
		em.setLastname("Mondal");
		em.setDateOfBirth("05/05/1996");
		em.setAddress("Kolkata");
		em.setCity("Kolkata");
		em.setState("WB");

		// String expectedResult = "{\"firstname\":\"Abuu\", \"lastname\":\"Mondal\",
		// \"address\":\"kolkata\"}";
		// String actualResult = JavaToJson.convertJson(em);

		// System.out.println(actualResult);
	}

	@Test
	public void convertJavaToJsonPassingNullValues() throws JsonProcessingException {
		Employee em = new Employee();

		String expectedResult = "{\r\n" + "  \"firstname\" : null,\r\n" + "  \"lastname\" : null,\r\n"
				+ "  \"address\" : null,\r\n" + "  \"city\" : null,\r\n" + "  \"state\" : null,\r\n"
				+ "  \"dateOfBirth\" : null\r\n" + "}";
		String actualResult = JavaToJson.convertJson(em);

		Assert.assertEquals(expectedResult, actualResult);
		// System.out.println(actualResult);
	}

	// @Test
	public void convertJavaToJsonPassingNullRef() throws JsonProcessingException {
		Employee em = null;

		String expected = "null";
		String actual = JavaToJson.convertJson(em);

		Assert.assertEquals(expected, actual);
	}

}
