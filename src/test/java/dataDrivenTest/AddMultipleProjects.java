package dataDrivenTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class AddMultipleProjects {

	@Test(dataProvider = "getdata")
	public void sampleTest(String pName,String status) {
		
		
		String reqBody="{\r\n"
				+ "  \"createdBy\": \"string\",\r\n"
				+ "  \"projectName\": \""+pName+"\",\r\n"
				+ "  \"status\": \""+status+"\",\r\n"
				+ "  \"teamSize\": 0\r\n"
				+ "}";
		
		given()
			.contentType(ContentType.JSON)
			.body(reqBody)
			.log().all()
		.when()
		.post("http://49.249.28.218:8091/addProject")
		.then()
			.log().all();
		
		
	}
	
	@DataProvider
	public Object[][] getdata() {
		
		Object [][]objArr=new Object[3][2];
		
		objArr[0][0]="intel_01";
		objArr[0][1]="Created";

		objArr[1][0]="intel_02";
		objArr[1][1]="Created";

		objArr[2][0]="intel_03";
		objArr[2][1]="Created";
		
		return objArr;
	}
	
}
