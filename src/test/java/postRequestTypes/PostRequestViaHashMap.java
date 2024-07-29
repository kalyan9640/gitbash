package postRequestTypes;

import static io.restassured.RestAssured.given;

import java.util.HashMap;


import io.restassured.http.ContentType;

public class PostRequestViaHashMap{

	public static void main(String[] args) {
		HashMap<String, Object> map=new HashMap();
		map.put("createdBy", "pavan");
		map.put("status", "created");
		map.put("teamSize", 10);
		map.put("projectName", "s.kalyan123");

		given()
			.contentType(ContentType.JSON)
			.body(map)
		.when()
			.post("http://49.249.28.218:8091/addProject")
		.then()
			.assertThat().statusCode(201)
			.log().all();
			}
	}
	
