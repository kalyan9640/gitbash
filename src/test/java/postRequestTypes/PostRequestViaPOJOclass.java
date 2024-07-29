package postRequestTypes;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.Random;

import io.restassured.http.ContentType;
import pojoClass.utility.ProjectPOJO;

public class PostRequestViaPOJOclass{

	public static void main(String[] args) {
		
		Random r=new Random();
		int n = r.nextInt(9999);
		
		// create object for pojo class
		
		ProjectPOJO pObj=new ProjectPOJO("s.kalyan"+n, "created", "pavan kalyan", 10);
	
		given()
			.contentType(ContentType.JSON)
			.body(pObj)
		.when()
			.post("http://49.249.28.218:8091/addProject")
		.then()
			.assertThat().statusCode(201)
			.log().all();
			}
	}
	
