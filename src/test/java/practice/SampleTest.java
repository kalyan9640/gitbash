package practice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleTest {

	@Test
	public void sampleGetReqTest() {
		Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		
		res.prettyPrint();
	}
	
}
