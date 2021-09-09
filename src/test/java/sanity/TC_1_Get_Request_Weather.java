package sanity;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_1_Get_Request_Weather {

	@Test
	public void getWeatherDetails() {
		// Specify the base URI
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/employee";
		
		// Specify Request Type ( GET,POST...)
		RequestSpecification httpRequest1=RestAssured.given();
		
		// Response Object
		Response res=httpRequest1.request(Method.GET, "/1");
		
		System.out.println("Response is : "+res.getBody().asString());
	}
}
