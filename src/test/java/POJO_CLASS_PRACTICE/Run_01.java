package POJO_CLASS_PRACTICE;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Run_01 {

	public static void main(String[] args) throws Throwable, DatabindException, IOException {
		List<String> lst = new ArrayList<String>();
		lst.add("Jhon");
		lst.add("david");
		lst.add("sagar");

		ProjectManager pm = new ProjectManager("pavan kalyan", "TP_01");
		Project p = new Project("BEATxp", "created", 10, lst, pm);

		ObjectMapper objM = new ObjectMapper();
		objM.writeValue(new File("./Project.json"), p);

		Project p1=new Project(null, null, 0, lst, pm);
		
		System.out.println("END");

	}
}
