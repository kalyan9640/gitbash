package responseValidation;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static  io.restassured.RestAssured.*;
public class VerifyResponseBodyTest {

	
	@Test
	public void verifyHeader() {
		
		Response resp = given()
		.get("http://49.249.28.218:8091/projects-paginated");
		
		resp.then().log().all();
		
		resp.then().assertThat().body("numberOfElements", Matchers.equalTo(20))
		
		.assertThat().body("empty", Matchers.equalTo(false))
		
		.assertThat().body("sort.sorted", Matchers.equalTo(false))
		
		.assertThat().body("content[1].createdOn", Matchers.equalTo("02/07/2024"));
		
		int data = resp.jsonPath().get("totalElements");
		
		Assert.assertEquals(data, 1779);
		
		System.out.println(data);
		
	}
	
}
