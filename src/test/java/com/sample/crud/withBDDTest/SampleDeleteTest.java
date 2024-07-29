package com.sample.crud.withBDDTest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class SampleDeleteTest {
	@Test
	public void deleteDatafromServer() {
		
		delete("http://49.249.28.218:8091/project/NH_PROJ_4937")
		.then()
			.assertThat().statusCode(204)
			.log().all();
	

	}
}
