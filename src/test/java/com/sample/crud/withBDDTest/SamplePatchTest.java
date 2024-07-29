package com.sample.crud.withBDDTest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class SamplePatchTest {
	@Test()
	public void putDataToServer() {
		JSONObject jsonobj=new JSONObject();
		
		jsonobj.put("projectName", "Lenovo2412651652");
		
		
		given()
			.contentType(ContentType.JSON)
			.body(jsonobj.toJSONString())
		.when()
			.patch("http://49.249.28.218:8091/project/NH_PROJ_1505")
		.then()
			.assertThat().statusCode(200)
			.log().all();
		
	}
}
