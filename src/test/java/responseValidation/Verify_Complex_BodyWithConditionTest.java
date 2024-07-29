package responseValidation;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static  io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.Random;
public class Verify_Complex_BodyWithConditionTest{

	
	@Test
	public void verifyComplexBody() {
		
		int r = new Random().nextInt(10000);
		String pName="S_P_K_"+r;
		JSONObject jsonobj=new JSONObject();
		jsonobj.put("createdBy", "pavanKalyan");
		jsonobj.put("status", "created");
		jsonobj.put("teamSize", 10);
		jsonobj.put("projectName",pName );
		
		given()
		.body(jsonobj.toJSONString())
		.contentType(ContentType.JSON)
	
		.when()
		.post("http://49.249.28.218:8091/addProject");
		
		
		
		Response resp = given()
		.get("http://49.249.28.218:8091/projects-paginated");
		
//		resp.then().log().all();
		
		ArrayList<String> al = JsonPath.read(resp.asString(),"content[*].[?(@.projectName=='"+pName+"')].createdBy");
		
		Assert.assertEquals(al.get(0), "pavanKalyan");
		
		System.out.println(pName);
	}
	
}
