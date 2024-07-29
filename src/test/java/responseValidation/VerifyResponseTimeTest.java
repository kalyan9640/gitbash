package responseValidation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class VerifyResponseTimeTest {

	@Test
	public void verifyTime() {

		Response resp = given().get("http://49.249.28.218:8091/projects");

		long time = resp.time();

		long timem = resp.timeIn(TimeUnit.SECONDS);

		System.out.println(time);
		System.out.println(timem);

		resp.then().assertThat().time(Matchers.lessThan(800l))

				.assertThat().time(Matchers.both(Matchers.lessThan(500l)).and(Matchers.greaterThan(200l)));

	}

}
