package apiTestcases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get {

	@Test
	public void test1() {

		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employees";
		RequestSpecification request = RestAssured.given(); // creating the object for request

		Response response = request.request(Method.GET); // click the send on get

		int statusCode = response.getStatusCode();

		System.out.println(statusCode);
		System.out.println(response.asString());
	}

}
