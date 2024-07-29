package com.backend.testing;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SamplePatchTest {
	@Test()
	public void putDataToServer() {
		JSONObject jsonobj=new JSONObject();
		
		jsonobj.put("projectName", "Lenovo");
		
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jsonobj.toJSONString());
		Response resp = req.patch("http://49.249.28.218:8091/project/NH_PROJ_1500");
		
		resp.prettyPrint();
		
		resp.then().assertThat().statusCode(200);
	}
}
