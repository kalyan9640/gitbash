package authentication;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class DigestAuth {
	@Test
	public void basicAuth() {

		given()
			.auth().digest("rmgyantr", "rmgy@9999")
			.log().all()
			
		.when()
			.get("http://49.249.29.5:8091/login")
		.then()
			.log()
			.all();

	}
}
