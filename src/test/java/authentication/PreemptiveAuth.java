package authentication;

import org.testng.annotations.Test;

import io.restassured.filter.Filter;

import static io.restassured.RestAssured.*;

public class PreemptiveAuth {
	@Test
	public void basicAuth() {

		Filter blacklistFilter = (requestSpec, responseSpec, ctx) -> {
			requestSpec.removeHeader("Authorization");
			requestSpec.removeHeader("Request URI");
		requestSpec.removeHeaders();
		
			return ctx.next(requestSpec, responseSpec);
		};
		
		given()
			.filter(blacklistFilter)
			.auth().preemptive().basic("rmgyantra", "rmgy@9999")
			.log().all()
			
		.when()
			.get("http://49.249.29.5:8091/login")
		.then()
			.log()
			.all();

	}
}
