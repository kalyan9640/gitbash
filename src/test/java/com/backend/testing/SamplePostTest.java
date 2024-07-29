package com.backend.testing;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SamplePostTest {
	@Test()
	public void postDataToServer() {
		JSONObject jsonobj=new JSONObject();
		jsonobj.put("createdBy", "pavan");
		jsonobj.put("status", "created");
		jsonobj.put("teamSize", 10);
		jsonobj.put("projectName", "abcxyz");



		
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jsonobj.toJSONString());
		Response resp = req.post("http://49.249.28.218:8091/addProject");
		resp.then().log().all();
		resp.then().assertThat().statusCode(201);
	}
}
