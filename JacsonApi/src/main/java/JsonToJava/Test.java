package JsonToJava;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

public static void main(String[] args) {
		
		String inputJson="{ \"name\":\"Divesh\"}";
		
		ObjectMapper mapper =new ObjectMapper();
		
		try {
			
		MainParser mp=	mapper.readValue(inputJson,MainParser.class);
		
		System.out.println(mp.getName());
		
		}
		catch (Exception e) {
			
		}
		
	}

}
