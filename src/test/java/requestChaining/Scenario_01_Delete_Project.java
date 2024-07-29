package requestChaining;

import static io.restassured.RestAssured.*;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClass.utility.ProjectPOJO;

public class Scenario_01_Delete_Project{

	
	
	@Test
	public void deleteProject() {
		
		//add project to the database
		
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
		
		String pID = resp.jsonPath().get("projectId");
		
		System.out.println(pID);
		
		given().delete("http://49.249.28.218:8091/project/"+pID)
		
		
		.then().log().all()
		.assertThat().statusCode(204);
		
		
		
			}
	}
	
