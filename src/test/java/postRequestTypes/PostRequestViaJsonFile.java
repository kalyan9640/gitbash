package postRequestTypes;

import static io.restassured.RestAssured.given;

import java.io.File;
import io.restassured.http.ContentType;

public class PostRequestViaJsonFile{

	public static void main(String[] args) {
		File file=new File("./project1.json");
		given()
			.contentType(ContentType.JSON)
			.body(file)
		.when()
			.post("http://49.249.28.218:8091/addProject")
		.then()
			.assertThat().statusCode(201)
			.log().all();
			}
	}
	
