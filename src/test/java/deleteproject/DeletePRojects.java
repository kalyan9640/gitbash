package deleteproject;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeletePRojects {

	@Test
	public void sample() {
		
	int n=4840;
	
	for (int i = 0; i < 95; i++) {
		String pid="NH_PROJ_"+n;
	
		delete("http://49.249.28.218:8091/project/"+pid)
		.then().log().all();
		n++;
	}
	}
}
