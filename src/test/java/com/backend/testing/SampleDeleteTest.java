package com.backend.testing;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleDeleteTest {
	@Test
	public void deleteDatafromServer() {
		
		Response resp = RestAssured.delete("http://49.249.28.218:8091/project/NH_PROJ_1471");

	
		
		resp.then().log().all();

		resp.then().assertThat().statusCode(204);

		
		resp.prettyPrint();

	}
}
