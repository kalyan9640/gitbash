package postRequestTypes;

import java.io.File;
import java.io.IOException;

import org.json.simple.JSONObject;

import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class KAL {

	public static void main(String[] args) throws Throwable, DatabindException, IOException {
		JSONObject jsonobj=new JSONObject();
		
		jsonobj.put("createdBy", "pavan");
		jsonobj.put("status", "created");
		jsonobj.put("teamSize", 10);
		jsonobj.put("projectName", "kalyan02552525252");
		
		jsonobj.put("team member", new String [] {"jhon","david","stev"});
		
		JSONObject j=new JSONObject();
		j.put("name", "kalpana");
		j.put("id", "kalpana_01");
		
		JSONObject j1=new JSONObject();
		j1.put("name", "kalyan");
		j1.put("id", "kalyan_01");
		jsonobj.put("projectManger",new JSONObject[] {j,j1} );
		
		ObjectMapper om=new ObjectMapper();
		om.writeValue(new File("./kalpana.json"), jsonobj);
		
		
		
		
		
			}
	}
	
