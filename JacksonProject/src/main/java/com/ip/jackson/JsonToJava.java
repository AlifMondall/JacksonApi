package com.ip.jackson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ip.model.Employee;

public final class JsonToJava {

	public static List convertJava(final String json) throws JsonParseException, JsonMappingException, IOException {

		List list = new ArrayList();

		BufferedReader br = new BufferedReader(new FileReader(new File(json)));
		String s = null;

		if ((s = br.readLine()) != null) {
			ObjectMapper mp = new ObjectMapper();
			list.add(mp.readValue(new File(json), Employee.class));
		} else {

			list.add(null);
		}
		return list;
	}
}
