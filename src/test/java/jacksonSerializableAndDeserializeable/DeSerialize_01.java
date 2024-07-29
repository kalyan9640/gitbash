package jacksonSerializableAndDeserializeable;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DeSerialize_01 {
public static void main(String[] args)
		throws StreamReadException, DatabindException, IOException {
	ObjectMapper objM=new ObjectMapper();
	
	Project p2 = objM.readValue(new File("./p1.json"), Project.class);
	
	System.out.println(p2.getProjectName());
	
	System.out.println(p2.getCreatedBy());

	System.out.println(p2.getStatus());

	System.out.println(p2.getTeamSize());

	
}
}
