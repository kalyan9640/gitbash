package pojoClass.utility;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class PAyrollCreation {

	
	@Test
	public void testName() throws Exception {
		
		PayRollPOJO pobj=new PayRollPOJO(5000, new Employee("QA", "20/01/1998", "kalyan@0832", "pavan0832", 3, "9640680832", "NH_PROJ_3818", "ROLE_EMPLOYEE", "kal9640"), 5000, 1000, 3000, 100000, 813, 2000, 5000, 50000, 10000, "enabled");
		
		PayRollPOJO p=new PayRollPOJO(DEFAULT_PORT, null, DEFAULT_PORT, DEFAULT_PORT, DEFAULT_PORT, DEFAULT_PORT, DEFAULT_PORT, DEFAULT_PORT, port, UNDEFINED_PORT, DEFAULT_PORT, DEFAULT_BODY_ROOT_PATH);
		
		
		given()
			.body(pobj)
			.contentType(ContentType.JSON)
		
		.when()
		.put("http://49.249.28.218:8091/update-payroll")
		
		.then().log().all();
		
	}
}
