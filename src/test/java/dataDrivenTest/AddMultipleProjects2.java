package dataDrivenTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ninza.hrm.api.genericutiltiy.ExcelUtility;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class AddMultipleProjects2 {

	@Test(dataProvider = "getdata")
	public void sampleTest(String pName,String status) {
		
		
		String reqBody="{\r\n"
				+ "  \"createdBy\": \"PAVAN KALYAN\",\r\n"
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
	public Object[][] getdata() throws Throwable {

		ExcelUtility eLib = new ExcelUtility();
		int l = eLib.getRowcount("Sheet1");

		Object[][] objArr = new Object[l][2];

		for (int i = 0; i < l; i++) {
			objArr[i][0] = eLib.getDataFromExcel("Sheet1", i + 1, 0);
			objArr[i][1] = eLib.getDataFromExcel("Sheet1", i + 1, 1);
		}
		return objArr;
	}
	
}
