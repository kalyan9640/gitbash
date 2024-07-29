package com.sample.crud.withBDDTest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class SamplePutTest {
	@Test()
	public void putDataToServer() {
		JSONObject jsonobj=new JSONObject();
		
		jsonobj.put("createdBy", "pavan");
		jsonobj.put("status", "created");
		jsonobj.put("teamSize", 105);
		jsonobj.put("projectName", "Dell");

		given()
			.contentType(ContentType.JSON)
			.body(jsonobj.toJSONString())
		.when()
			.put("http://49.249.28.218:8091/project/NH_PROJ_1492")
		.then()
			.assertThat().statusCode(200)
			.log().all();
	}
}
