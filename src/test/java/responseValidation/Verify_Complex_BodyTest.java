package responseValidation;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import io.restassured.response.Response;

import static  io.restassured.RestAssured.*;

import java.util.ArrayList;
public class Verify_Complex_BodyTest{

	
	@Test
	public void verifyComplexBody() {
		
		Response resp = given()
		.get("http://49.249.28.218:8091/projects-paginated");
		
		resp.then().log().all();
		
		
		
		
		ArrayList<String> al = JsonPath.read(resp.asString(),"content[*].createdBy");
		
		for (String s : al) {
			System.out.println(s);
		}
	}
	
}
