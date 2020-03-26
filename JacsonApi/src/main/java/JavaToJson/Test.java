package JavaToJson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

	
public static void main(String[] args) {
		
		ObjectMapper mapper= new ObjectMapper();
		Emplyoee exam= JsonExample();
		
		try {
			String jsonString=mapper.writeValueAsString(exam);
			System.out.println(jsonString);
		} 
		catch (JsonProcessingException e) {
			
			e.printStackTrace();
		}
	}

	private static Emplyoee JsonExample() {
		Emplyoee exam =new Emplyoee();
		exam.setid(001);
		exam.setname("Divesh");
		exam.setprice(10.00f);
		return exam;
	}

}
