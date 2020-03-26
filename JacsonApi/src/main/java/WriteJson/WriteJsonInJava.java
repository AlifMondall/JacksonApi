package WriteJson;

import java.io.FileWriter;

import org.json.JSONArray;
import org.json.JSONObject;

public class WriteJsonInJava {
	
public static void main(String[] args) {
		
		JSONObject obj= new JSONObject();
		
		obj.put("name", "Divesh");
		obj.put("id","001");
		obj.put("job", "Automation");
		
		JSONArray json=new JSONArray();
		
		json.put("java");
		json.put("selenium");
		
		obj.put("technology", json);
		
		
		try {
			
			FileWriter file=new FileWriter("Myjson.json");
			file.write(obj.toString());
			file.flush();
			file.close();
			
		} catch (Exception e) {
			
		}
		
	}
	

}
