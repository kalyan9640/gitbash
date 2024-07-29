package requestChaining;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClass.utility.EmployPOJO;
import pojoClass.utility.ProjectPOJO;

public class Scrnario_02_Add_EmployToProject {

	
	@Test
	public void addEmployToProject() {
		
//		add project to the database
		
				Random r=new Random();
				int n = r.nextInt(9999);
				
				// create object for pojo class
				
				ProjectPOJO pObj=new ProjectPOJO("s.kalyan"+n, "created", "pavan kalyan", 10);
			
				Response resp = given()
					.contentType(ContentType.JSON)
					.body(pObj)
				.when()
					.post("http://49.249.28.218:8091/addProject");
				resp.then()
					.assertThat().statusCode(201)
					.log().all();
				
				String projectName = resp.jsonPath().get("projectName");
				
				System.out.println(projectName);
			
				//add employee to database
				
				EmployPOJO eObj=new EmployPOJO("QA", "20/04/1998", "kalyan0832@outlook.com", "Pavan kalyan", 3.8, "9640680888", projectName, "ROLE_EMPLOYEE", "kalyan"+n);
				
					given()
						.contentType(ContentType.JSON)
						.body(eObj)
					.when()
						.post("http://49.249.28.218:8091/employees");
					resp.then()
						.assertThat().statusCode(201)
						.log().all();
				
		
	}
}
