package apiTestcases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Test
public class Post {

	public void test1() {

		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/create";
		RequestSpecification request = RestAssured.given();

		Object str = "{\"name\":\"Hazel Tony\",\"salary\":\"4657\",\"age\":\"26\"}";// passing the body

		// Add the Json to the body of the request
		request.body(str);

		// Add the header
		request.header("Content-Type", "application/json");

		// Post the request and check the response
		Response response = request.request(Method.POST); // click the send on get

		int statusCode = response.getStatusCode();

		System.out.println(statusCode);
		System.out.println(response.asString());
	}
}
