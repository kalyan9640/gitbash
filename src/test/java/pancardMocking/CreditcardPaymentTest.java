package pancardMocking;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;



import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreditcardPaymentTest {

	@Test
	public void sampleTest() {
		JSONObject jobj=new JSONObject();
		jobj.put("creditcard", "1234567891");
		jobj.put("cvv", "123");
		jobj.put("cardName", "kalyan");

		given()
		.contentType(ContentType.JSON)
			.body(jobj.toJSONString())
		.when()
			.post("http://localhost:8890/credit-card")
		.then()
			.log().all();
		
		
	}
}
