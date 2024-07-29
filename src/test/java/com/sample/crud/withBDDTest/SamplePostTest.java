package com.sample.crud.withBDDTest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class SamplePostTest {
	@Test()
	public void postDataToServer() {
		JSONObject jsonobj=new JSONObject();
		jsonobj.put("createdBy", "pavan");
		jsonobj.put("status", "created");
		jsonobj.put("teamSize", 10);
		jsonobj.put("projectName", "kalyan02552525252");

		given()
			.contentType(ContentType.JSON)
			.body(jsonobj.toJSONString())
		.when()
			.post("http://49.249.28.218:8091/addProject")
		.then()
			.assertThat().statusCode(201)
			.log().all();
			}
}
