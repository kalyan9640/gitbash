package com.sample.crud.withBDDTest;


import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class SampleGetTest {
	@Test
	public void getDatafromServer() {
		
		given()
			.get("http://49.249.28.218:8091/projects")
		.then()
			.assertThat().statusCode(200)
			.log().all();

		

	}
}