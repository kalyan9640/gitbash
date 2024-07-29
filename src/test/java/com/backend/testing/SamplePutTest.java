package com.backend.testing;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SamplePutTest {
	@Test()
	public void putDataToServer() {
		JSONObject jsonobj=new JSONObject();
		
		jsonobj.put("createdBy", "pavan");
		jsonobj.put("status", "created");
		jsonobj.put("teamSize", 105);
		jsonobj.put("projectName", "Dell");



		
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jsonobj.toJSONString());
		Response resp = req.put("http://49.249.28.218:8091/project/NH_PROJ_1256");
		resp.then().log().all();
		resp.then().assertThat().statusCode(200);
	}
}
