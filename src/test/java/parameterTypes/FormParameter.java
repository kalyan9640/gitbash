package parameterTypes;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class FormParameter {

	
	@Test
	public void formParameter() {
		given()
		.formParam("status","created")
		.log().all()
		.when()
		.post("http://49.249.28.218:8091/project")
		.then()
		.log().all();
	}
}
