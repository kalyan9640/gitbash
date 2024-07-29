package requestChaining;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class Scenario_03_PayRollinfo {
	
	@Test
	public void payroll() {
		//Authorization
		
		Response resp = given()
			.formParam("client_id", "ninza-client")
			.formParam("client_secret", "gPQBf1Yxew5OMccMhzos1GefIyiSnXzM")
			.formParam("grant_type", "client_credentials")
		.when()
			.post("http://49.249.28.218:8180/auth/realms/ninza/protocol/openid-connect/token");
		
		resp.then()
			.log().all();
		String token = resp.jsonPath().get("access_token");
		
		System.out.println(token);
		//get payroll info
		
		
		given()
			.auth().oauth2(token)
			.get("http://49.249.28.218:8091/admin/payrolls")
		.then()
			.log().all();

	}
}
