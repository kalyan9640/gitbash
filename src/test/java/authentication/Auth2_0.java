package authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Auth2_0 {
	@Test
	public void basicAuth() {
		
		Response resp = given()
			.formParam("client_id", "ninza-client")
			.formParam("client_secret", "gPQBf1Yxew5OMccMhzos1GefIyiSnXzM")
			.formParam("grant_type", "client_credentials")
		
		.when()
			.post("http://49.249.28.218:8180/auth/realms/ninza/protocol/openid-connect/token");
		
		resp.then()
			.log().all();
		
	String token = resp.jsonPath().get("access_token");
		
		given()
			.auth().oauth2(token)
//			.param("teamSize", 5)
			.queryParam("createdOn", "03/07/2024")
			.queryParams(null)
		.when()
			.get("http://49.249.28.218:8091/project")
		.then()
			.log().all();

	}
}
