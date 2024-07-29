package responseValidation;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static  io.restassured.RestAssured.*;

import java.util.ArrayList;
public class FetchAllProjectIDs {

	
	@Test
	public void verifyHeader() {
		
		Response resp = given()
		.get("http://49.249.28.218:8091/projects-paginated");
		resp.then().log().all();
		
		ArrayList<String> al = resp.jsonPath().get("content.createdBy");
		
		
		System.out.println(al);
		
		
	}
	
}
