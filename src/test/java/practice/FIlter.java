package practice;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.filter.Filter;




public class FIlter {

	@Test
	public void paramParameter() {
		Filter blacklistFilter = (requestSpec, responseSpec, ctx) -> {
			requestSpec.removeParam("teamSize");
		
			return ctx.next(requestSpec, responseSpec);
		};
		given()
//		.filter(blacklistFilter)
		.param("teamSize",5)
		.log().all()
		.when()
		.get("http://49.249.28.218:8091/project")
		.then()
		.log().all();
	}
}
