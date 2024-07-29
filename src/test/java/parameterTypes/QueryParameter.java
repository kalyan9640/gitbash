package parameterTypes;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class QueryParameter {

	@Test
	public void queryParameter() {
		given()
			.queryParam("teamSize", "5")
			.pathParam("path", "project")
		.when()
			.get("http://49.249.28.218:8091/{path}")
		.then()
			.log().all();
	}
}
