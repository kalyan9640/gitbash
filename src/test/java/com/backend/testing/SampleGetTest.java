package com.backend.testing;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleGetTest {
	@Test
	public void getDatafromServer() {
		
		Response resp = RestAssured.get("http://49.249.28.218:8091/projects");

		resp.then().log().all();

		resp.then().assertThat().statusCode(200);

		
		resp.prettyPrint();

	}
}
