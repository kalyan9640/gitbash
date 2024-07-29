package parameterTypes;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PathParameter {

	
	@Test
	public void pathParameter() {
		given()
		.pathParam("path", "projects")
		.when()
		.get("http://49.249.28.218:8091/{path}")
		.then()
		.log().headers();
	}
}
