package com.ip.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


public final class JavaToJson {

	public static String convertJson(final Object obj) throws JsonProcessingException {
		ObjectMapper mp = new ObjectMapper();
		mp.configure(SerializationFeature.INDENT_OUTPUT, true);
		// mp.writeValue(new File("Myjson.json"), obj);
		return mp.writeValueAsString(obj);
	}
}